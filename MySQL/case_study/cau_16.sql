use furama_dn ;
	--     18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
	delete khach_hang
	from khach_hang  
	join hop_dong  on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
	where year(hop_dong.ngay_lam_hop_dong) < 2021;

	DELIMITER //
	create trigger tr_drop_hop_dong
	before delete on khach_hang
	for each row
	begin 
	delete from hop_dong
	where ma_khach_hang = old.ma_khach_hang;
	end //
	DELIMITER ;

drop trigger tr_drop_hop_dong;