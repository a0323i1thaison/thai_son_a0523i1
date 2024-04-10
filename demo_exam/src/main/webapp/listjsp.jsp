<%--
  Created by IntelliJ IDEA.
  User: thais
  Date: 3/1/2024
  Time: 9:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>manage_employee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
          crossorigin="anonymous">
</head>
<body>
<a href="" type="button" class = " btn btn-primary "></a>

 <table class="table table-hover" border="1">
    <thead>
     <tr>
        <th> STT</th>
        <th> Họ và tên  </th>
        <th>  Ngày Sinh </th>
        <th> Giới Tính  </th>
        <th> Số CMND </th>
        <th> Số Điện Thoại </th>
        <th> Địa Chỉ  </th>
        <th> chỉnh sửa  </th>
    </tr>
    </thead>
        <tbody>
<%--        // lấy dữ liệu--%>
        <c:forEach items="${listjsp}" var="e" varStatus="son">
            <tr>
            <td> ${son.count}</td>
            <td> ${e.getName()}</td>
            <td> ${e.getNgay_sinh()}</td>
            <c:if test="${e.getGioi_tinh()==0}">
                <td>Nữ</td>
            </c:if>\
            <c:if test="${e.getGioi_tinh()==1}">
                <td>Nam</td>
            </c:if>
            <td> ${e.getCmnd()}</td>
            <td> ${e.getSdt()}</td>
            <td> ${e.getDia_chi()}</td>
            <td>
                <div style="display:flex; align-items: center; justify-content: space-between">
                    <a class="btn btn-primary" href="/Servlet?action=edit&ma_nhan_vien${e.getName()}" role="button" style="margin-right: 5px" >Edit</a>
                    <button type="button" class="btn btn-danger" onclick="sendInformation('${e.getMa_nhan_vien()}','${e.getName()}')"
                            data-bs-toggle="modal" data-bs-target="#exampleModal">
                        Xóa
                    </button>
                </div>
            </td>
            </tr>
        </c:forEach>
        </tbody>
</table>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Xác nhận xóa</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form method="post" action="/Servlet?action=delete">
                <div class="modal-body">
                    <input type="hidden" id="id" name="id">
                    Bạn có chắc chắn muốn xóa <span id="name"></span> ?
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
                    <button type="submit" class="btn btn-primary">Xác nhận</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
<script>
    function sendInformation(id,name) {
        document.getElementById("name").innerText = name;
        document.getElementById("id").value = id;
    }
</script>

</body>

</html>
