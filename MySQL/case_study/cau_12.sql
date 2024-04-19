use furama_dn; 
 -- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem, sum(hdct.so_luong) as so_luong_dich_vu_di_kem
from dich_vu_di_kem dvdk 
join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
group by dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem
having so_luong_dich_vu_di_kem = (select max(so_luong_dich_vu_di_kem) from (select 	sum(hdct2.so_luong) as so_luong_dich_vu_di_kem
																					from dich_vu_di_kem dvdk2 
																					join hop_dong_chi_tiet hdct2 on dvdk2.ma_dich_vu_di_kem = hdct2.ma_dich_vu_di_kem
                                                                                    group by dvdk2.ma_dich_vu_di_kem)as max)
order by  ma_dich_vu_di_kem;