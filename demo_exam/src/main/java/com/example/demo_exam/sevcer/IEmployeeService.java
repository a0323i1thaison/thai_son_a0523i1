package com.example.demo_exam.sevcer;

import com.example.demo_exam.model.employee;

import java.util.List;

public interface IEmployeeService {
    List<employee> displaylist();
    void addemployee(employee employee );
    boolean delete (int  ma_nhan_vien);
    boolean update (employee employee);
    employee seletemployee ( int ma_nhan_vien);
}
