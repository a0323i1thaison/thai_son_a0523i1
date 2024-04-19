use furama_dn ;
-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.

select nv.ma_nhan_vien as id, nv.ho_ten, nv.ngay_sinh,nv.so_dien_thoai, nv.email, nv.dia_chi from nhan_vien nv 
union select kh.ma_khach_hang , kh.ho_ten, kh.ngay_sinh, kh.so_dien_thoai, kh.email, kh.dia_chi from khach_hang kh;