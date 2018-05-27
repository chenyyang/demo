<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!doctype html>
<%@ include file="/views/head.html"%>

<body>

<%@ include file="/views/menu.html"%>

<div class="panel panel-default">
    <div class="panel-heading">用户列表</div>
    <table class="table table-hover">
    <tr>
        <th>序号</th>
        <th>ID</th>
        <th>名称</th>
        <th>年龄</th>
    </tr>
    <c:forEach items="${list}" var="item" varStatus="id">
    <tr>
        <td>${id.count}</td>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.age}</td>
    </tr>
    </c:forEach>
    </table>
</div>

<script src="/include/bootstrap-3.3.7/js/jquery-3.3.1.min.js"></script>
<script src="/include/bootstrap-3.3.7/js/bootstrap.min.js"></script>
</body>
</html>