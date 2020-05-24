<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="WEB-INF/lib/bootstrap.jsp" %>
<title>従業員情報管理システム - ログイン</title>
</head>
<body>
  <h1 >従業員情報管理システム  <span style="font-family: Impact; font-size: 40px;">EmpleBee</span>(仮)</h1>
  <h3>ログイン</h3>
  <form action="login-servlet" method="post">
    ID
    <input type="text" name="id">
    <br>
    パスワード
    <input type="password" name="password">
    <input type="submit" value="ログイン" class="btn btn-primary">
  </form>
</body>
</html>