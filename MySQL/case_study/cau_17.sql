use furama_dn ;
-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 3 lần trong năm 2020 lên gấp đôi.
update dich_vu_di_kem as dvdk
join (select dvdk.ma_dich_vu_di_kem
from dich_vu_di_kem dvdk 
join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
group by hdct.ma_dich_vu_di_kem
having count(hdct.ma_dich_vu_di_kem) = 3) as subquery on dvdk.ma_dich_vu_di_kem = subquery.ma_dich_vu_di_kem
set gia = gia * 2;