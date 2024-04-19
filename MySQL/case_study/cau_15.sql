use furama_dn ; 
-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
	 update khach_hang as kh
		join (select kh.ma_khach_hang, kh.ho_ten, lk.ten_loai_khach, sum(dv.chi_phi_thue)
    from khach_hang kh 
    join loai_khach lk on kh.ma_loai_khach = lk.ma_loai_khach
    join hop_dong hd on kh.ma_khach_hang = hd.ma_khach_hang
    join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
    where year(hd.ngay_lam_hop_dong) = 2021
    group by  kh.ma_khach_hang, kh.ho_ten, lk.ten_loai_khach
    having sum(dv.chi_phi_thue) > 10000000) as  subquery ON kh.ma_khach_hang = subquery.ma_khach_hang
SET kh.ma_loai_khach = 1;