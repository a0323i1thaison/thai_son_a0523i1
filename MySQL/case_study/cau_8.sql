use furama_dn;
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(hd.ngay_lam_hop_dong) as thang, count(kh.ma_khach_hang) as so_luong_khach_hang
from hop_dong hd
join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang 
where year(ngay_lam_hop_dong) = 2021
group by thang
order by thang;