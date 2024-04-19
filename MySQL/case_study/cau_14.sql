use furama_dn;
--     16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021
	   delete nv from nhan_vien
	   left join ( select nv.ma_nhan_vien, nv.ho_ten, count(hd.ma_nhan_vien) as so_lan from nhan_vien nv 
				left join hop_dong hd on nv.ma_nhan_vien = hd.ma_nhan_vien
				where year(hd.ngay_lam_hop_dong) between 2019 and 2021 OR hd.ngay_lam_hop_dong IS NULL
				group by nv.ma_nhan_vien, nv.ho_ten
				having  so_lan = 0 ) as subquery on nv.ma_nhan_vien = subquery.ma_nhan_vien
                where subquery.ma_nhan_vien is not null;
            