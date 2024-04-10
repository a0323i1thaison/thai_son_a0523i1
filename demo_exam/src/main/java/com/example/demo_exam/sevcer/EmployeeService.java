package com.example.demo_exam.sevcer;

import com.example.demo_exam.model.employee;
import com.example.demo_exam.reponsitory.EmployeeRiponsitory;
import com.example.demo_exam.reponsitory.IEmployeeReponsitory;

import java.util.List;

public class EmployeeService  implements IEmployeeService{
    private static IEmployeeReponsitory employeeRiponsitory = new EmployeeRiponsitory();


    @Override
    public List<employee> displaylist() {
        return employeeRiponsitory.displaylist();
    }

    @Override
    public void addemployee(employee employee) {

    }

    @Override
    public boolean delete(int ma_nhan_vien) {
        return employeeRiponsitory.delete(ma_nhan_vien) ;
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
