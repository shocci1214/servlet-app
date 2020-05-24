<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" import="java.util.List, java.util.ArrayList, model.entity.SectionBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員情報管理システム - 従業員登録</title>
</head>
<body>
  <h1>従業員登録</h1>
  <form action="#" method="post">

    <label for="employee-code">従業員コード</label>
    <input type="text" name="employ-code">
    <br>
    <label for="last-name">氏</label>
    <input type="text" name="last-name">
    <br>
    <label for="first-name">名</label>
    <input type="text" name="first-name">
    <br>
    <label for="last-kana-name">氏かな</label>
    <input type="text" name="last-kana-name">
    <br>
    <label for="first-kana-name">名かな</label>
    <input type="text" name="first-kana-name">
    <br>
    <label for="gender">性別</label>
    <input type="radio" name="gender" value="0">
    不明
    <input type="radio" name="gender" value="1">
    男
    <input type="radio" name="gender" value="2">
    女
    <br>
    生年月日
    <select name="birth-year">
      <%
          for (int i = 1940; i <= 2020; i++) {
      %>
      <option value="<%= i %>"><%= i %></option>
      <%
          }
      %>
    </select>
    <label for="birth-year">年</label>
    <select name="birth-month">
      <%
          for (int i = 1; i <= 12; i++) {
      %>
      <option value="<%= i %>"><%= i %></option>
      <%
          }
      %>
    </select>
    <label for="birth-month">月</label>
        <select name="birth-day">
      <%
          for (int i = 1; i <= 31; i++) {
      %>
      <option value="<%= i %>"><%= i %></option>
      <%
          }
      %>
    </select>
    <label for="birth-day">日</label>
    <br>
    <label for="section-code">部署名</label>
    <select name="section-code">
      <% List<SectionBean> sectionList = (List<SectionBean>) request.getAttribute("sectionList"); %>
      <option value=""></option>
    </select>
    <br>
        入社日
    <select name="hire-year">
      <%
          for (int i = 1940; i <= 2020; i++) {
      %>
      <option value="<%= i %>"><%= i %></option>
      <%
          }
      %>
    </select>
    <label for="hire-year">年</label>
    <select name="hire-month">
      <%
          for (int i = 1; i <= 12; i++) {
      %>
      <option value="<%= i %>"><%= i %></option>
      <%
          }
      %>
    </select>
    <label for="hire-month">月</label>
        <select name="hire-day">
      <%
          for (int i = 1; i <= 31; i++) {
      %>
      <option value="<%= i %>"><%= i %></option>
      <%
          }
      %>
    </select>
    <label for="hire-day">日</label>
    <br>
    <input type="submit" value="新規登録">
  </form>
</body>
</html>