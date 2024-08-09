package com.example.productthi.controller;
import com.example.productthi.dto.ProductDto;
import com.example.productthi.model.Category;
import com.example.productthi.model.Product;
import com.example.productthi.service.CategoryService;
import com.example.productthi.service.ICategoryService;
import com.example.productthi.service.IProductService;
import com.example.productthi.service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "ProductServlet", value = "/product")

public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductService();
    private ICategoryService categoryService = new CategoryService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "add":
                showAddForm(req, resp);
                break;
            case "delete":
                deleteById(req, resp);
                break;
            case "edit":
                showEditForm(req,resp);
                break;
            case "search":
                search(req,resp);
                break;
            case "list":
                showList(req, resp);
                break;
            default:
                showList(req, resp);
        }
    }

    private void showList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ProductDto> products = productService.findAllDto();
        req.setAttribute("products", products);
        List<Category> categories = categoryService.getAll();
        req.setAttribute("categories", categories);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/list.jsp");
        requestDispatcher.forward(req, resp);

    }

    private void search(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String searchName = req.getParameter("searchName");
        int searchCategory = Integer.parseInt(req.getParameter("searchCategory"));
        System.out.println(searchName + searchCategory);
        List<ProductDto> products = productService.search(searchName, searchCategory);
        req.setAttribute("products", products);
        List<Category> categories = categoryService.getAll();
        req.setAttribute("categories", categories);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/list.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void showEditForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int editId = Integer.parseInt(req.getParameter("editId"));
        Product product = productService.findById(editId);
        req.setAttribute("product", product);
        List<Category> categories = categoryService.getAll();
        req.setAttribute("categories", categories);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/edit.jsp");
        requestDispatcher.forward(req,resp);
    }

    private boolean deleteById(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int deleteId = Integer.parseInt(req.getParameter("deleteId"));
        resp.sendRedirect("/product?action=list");
        return productService.deleteById(deleteId);
    }

    private void showAddForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> categories = categoryService.getAll();
        req.setAttribute("categories", categories);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "add":
                add(req, resp);
                break;
            case "delete":
                deleteById(req, resp);
                break;
            case "update":
                update(req, resp);
                break;
            case "search":
                search(req, resp);
                break;
            case "list":
                showList(req, resp);
                break;
            default:
                showList(req, resp);
        }
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        String color = req.getParameter("color");
        String description = req.getParameter("description");
        int category = Integer.parseInt(req.getParameter("category_id"));
        boolean isOK = productService.update(new Product(id, name, price,quantity, color, description, category));
        String message = isOK?"OK":"NOTOK";
        resp.sendRedirect("/product?action=list&mess="+message);
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        String color = req.getParameter("color");
        String description = req.getParameter("description");
        int category = Integer.parseInt(req.getParameter("category"));
        boolean isOK = productService.add(new Product(name, price, quantity, color, description, category));
        String message = isOK?"OK:":"NOTOK";
        resp.sendRedirect("/product?action=list&mess="+message);
    }

}
