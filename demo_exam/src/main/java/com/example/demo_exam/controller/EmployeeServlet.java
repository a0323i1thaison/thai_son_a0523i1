package com.example.demo_exam.controller;

import com.example.demo_exam.model.employee;
import com.example.demo_exam.sevcer.EmployeeService;
import com.example.demo_exam.sevcer.IEmployeeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet", value = "c")
public class EmployeeServlet extends HttpServlet {
    private static IEmployeeService employeeSrevice = new EmployeeService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = null;
        if( action == null ){
            action = " ";
        }switch (action){
            case " create":
            break;
            case " delete":
                break;
            case " update":
                break;
            default:
                employeeldisplay(request,response);
                break;
        }
    }

    private void employeeldisplay(HttpServletRequest request, HttpServletResponse response) {
        List<employee> listjsp = employeeSrevice.displaylist();
        request.setAttribute("listjsp",listjsp);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/listjsp.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = null;
        if( action == null ){
            action = "";
        }switch (action){
            case "create":
                break;
            case "delete":
                deleteEmployeeById(request,response);
                break;
            case "update":
                break;
            default:
                employeeldisplay(request,response);
                break;
        }
    }

    private void deleteEmployeeById(HttpServletRequest request, HttpServletResponse response) {
        int ma_nhan_vien = Integer.parseInt(request.getParameter("ma_nhan_vien")) ;
        employeeSrevice.delete(ma_nhan_vien);

        try {
            response.sendRedirect("/Servlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
