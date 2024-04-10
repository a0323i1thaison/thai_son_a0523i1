package com.example.demo_exam.reponsitory;

import com.example.demo_exam.model.employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRiponsitory implements IEmployeeReponsitory{
    private static final String FINAL_ALL = "SELECT * FROM demo3.employee where trang_thai = 0 ;";
    private static final String DELETE_EMPLOYEE = " UPDATE demo3.employee SET trang_thai = 1 WHERE ma_nhan_vien = ? ";
    @Override
    public List<employee> displaylist() {
        List<employee> listemployee = new ArrayList<>();
        Connection connetion = BaseReponsitory.getConnection();
        Statement statement = null;
        try {
            statement = connetion.createStatement();
            ResultSet resultSet = statement.executeQuery(FINAL_ALL);
            while (resultSet.next()){
                int ma_nhan_vien = resultSet.getInt("ma_nhan_vien");
                String ho_ten = resultSet.getString("ho_ten");
                Date ngay_sinh = resultSet.getDate("ngay_sinh");
                int gioi_tinh  = resultSet.getInt("gioi_tinh");
                int cmnd  = resultSet.getInt("so_cmnd");
                int sdt  = resultSet.getInt("so_dien_thoai");
                String dia_chi = resultSet.getString("dia_chi");
                listemployee.add(new employee(ma_nhan_vien,ho_ten,ngay_sinh,gioi_tinh,cmnd,sdt,dia_chi));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listemployee;
    }

    @Override
    public void addemployee(employee employee) {

    }

    @Override
    public boolean delete(int ma_nhan_vien) {
        boolean rowdelete = false;
        Connection connection = BaseReponsitory.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement( DELETE_EMPLOYEE);
            preparedStatement.setInt(1,ma_nhan_vien);
             rowdelete = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowdelete;
    }

    @Override
    public boolean update(employee employee) {
        return false;
    }

    @Override
    public employee seletemployee(int ma_nhan_vien) {
        return null;
    }
}
