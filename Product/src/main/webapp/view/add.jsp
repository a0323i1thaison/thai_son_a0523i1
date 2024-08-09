<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/8/2024
  Time: 8:42 PM
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
    <form novalidate action="/product?action=add" method="post" class="w-50 ms-5">
        <h2>Thêm sản phẩm</h2>
        <%--        <div class="form-floating mb-3">--%>
        <%--            <input type="text" id="id" name="id" class="form-control" placeholder="Nhập Id" required>--%>
        <%--            <label for="id">ID sản phẩm</label>--%>
        <%--        </div>--%>
        <div class="form-floating mb-3">
            <input type="text" id="name" name="name" class="form-control" placeholder="Nhập tên" required>
            <label for="name" class="form-label">Tên sản phầm</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" id="price" name="price" class="form-control" placeholder="Nhập giá" required>
            <label for="price" class="form-label">Giá</label>
        </div>
        <div class="form-floating mb-3">
            <input type="number" id="quantity" name="quantity" class="form-control" placeholder="Nhập số lượng" required>
            <label for="quantity" class="form-label">Số lượng sản phẩm</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" id="color" name="color" class="form-control" placeholder="Nhập màu sắc" required>
            <label for="color" class="form-label">Màu sắc sản phẩm</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" id="description" name="description" class="form-control" placeholder="Mô tả" required>
            <label for="description" class="">Mô tả</label>
        </div>
        <div class="mb-3">
            <label for="category" class="form-label">Danh mục sản phẩm</label>
            <select name="category" id="category" value="">
                <c:forEach var="category" items="${categories}">
                    <option value="${category.getId()}">${category.getDanhmuc()}</option>
                </c:forEach>
                -- Chọn danh mục sản phẩm--
            </select>
        </div>
        <button class="btn btn-success" type="submit">Thêm mới</button>
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
