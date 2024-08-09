<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/10/2024
  Time: 6:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <form action="/product?action=update" method="post" class="w-50 ms-5">
        <h2>Sửa thông tin sản phẩm</h2>
        <div class="form-floating mb-3">
            <input type="text" id="id" name="id" class="form-control" placeholder="Nhập Id" value="${product.getId()}"
                   readonly>
            <label for="id">ID sản phẩm</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" id="name" name="name" class="form-control" placeholder="Nhập tên"
                   value="${product.getName()}" required>
            <label for="name" class="form-label">Tên sản phầm</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" id="price" name="price" class="form-control" placeholder="Nhập giá"
                   value="${product.getPrice()}" required>
            <label for="price" class="form-label">Giá</label>
        </div>
        <div class="form-floating mb-3">
            <input type="number" id="quantity" name="quantity" class="form-control" placeholder="Nhập số lượng"
                   value="${product.getQuantity()}" required>
            <label for="name" class="form-label">Số lượng sản phẩm</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" id="color" name="color" class="form-control" placeholder="Nhập màu sắc"
                   value="${product.getColor()}" required>
            <label for="price" class="form-label">Màu sắc sản phẩm</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" id="description" name="description" class="form-control" placeholder="Mô tả"
                   value="${product.getDescription()}" required>
            <label for="description" class="">Mô tả</label>
        </div>
        <div class="mb-3">
            <label for="category_id" class="form-label">Hãng sản xuất</label>
            <select name="category_id" id="category_id" >
                <c:forEach var="category_id" items="${categories}">
                    <option value="${category_id.getId()}">${category_id.getDanhmuc()}</option>
                </c:forEach>
            </select>
        </div>
        <button class="btn btn-success" type="submit">Cập nhật</button>
    </form>
</div>
<script>
    const form = document.querySelector("form");
    form.addEventListener("submit", e => {
        if (!form.checkValidity()) {
            e.preventDefault();
        }
        form.classList.add("was-validated")
    })
</script>
</body>
</html>
