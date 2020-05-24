<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" import="model.entity.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet"
  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
  integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
  crossorigin="anonymous">
<title>従業員情報管理システム - 従業員一覧</title>
</head>
<body>
  <h1>従業員詳細</h1>
  <table>
    <%
        EmployeeBean employee = (EmployeeBean) request.getAttribute("employee");
    %>
    <tr>
      <th>従業員コード</th>
      <td><%=employee.getEmployeeCode()%></td>
    </tr>

    <tr>
      <th>氏名</th>
      <td><%=employee.getLastName()%> <%=employee.getFirstName()%></td>
    </tr>

    <tr>
      <th>氏名かな</th>
      <td><%=employee.getLastKanaName()%> <%=employee.getFirstKanaName()%></td>
    </tr>

    <tr>
      <th>性別</th>
      <%
          if (employee.getGender() == 1) {
      %>
      <td>男</td>
      <%
          } else if (employee.getGender() == 2) {
      %>
      <td>女</td>
      <%
          }
      %>
    </tr>

    <tr>
      <th>部署名</th>
      <td><%=employee.getSectionName()%></td>
    </tr>

    <tr>
      <th>入社日</th>
      <td><%=employee.getHireDate()%></td>
    </tr>

    <tr>
      <th>更新日時</th>
      <td><%=employee.getUpdateDateTime()%></td>
    </tr>

  </table>

  <a href="employee-edit-servlet?employee-code=<%= employee.getEmployeeCode() %>"  class="btn btn-primary">編集</a>
  <a href="employee-delete-servlet?employee-code=<%= employee.getEmployeeCode() %>" class="btn btn-danger" onclick="return confirm('削除してよろしいですか？');">削除</a>
</body>
</html>