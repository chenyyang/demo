<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!doctype html>
<html>
<%@ include file="/views/head.html"%>

<body>
<%@ include file="/views/menu.html"%>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">添加用户</h3>
    </div>

    <div class="panel-body">
<form class="bs-example bs-example-form" data-example-id="input-group-sizing" action="/user/add" method="post">
    <div class="input-group">
        <span class="input-group-addon" >name</span>
        <input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1" name="name">
    </div>
    <p class="help-block"></p>
    <div class="input-group">
        <span class="input-group-addon" >age</span>
        <input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1" name="age">
    </div>
    <p class="help-block"></p>
    <button type="submit" class="btn btn-default">Submit</button>
</form>

    </div>
</div>


<script src="/include/bootstrap-3.3.7/js/jquery-3.3.1.min.js"></script>
<script src="/include/bootstrap-3.3.7/js/bootstrap.min.js"></script>
</body>
</html>