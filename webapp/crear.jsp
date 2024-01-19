<%--
  Created by IntelliJ IDEA.
  User: ESPE
  Date: 19/01/2024
  Time: 7:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear Auto</title>
</head>
<body>
<h1>Datos del Auto</h1>
<form action="servletController" method="post">
    <input type="hidden" name="opcion" value="crear">
    <table>
        <td>Marca</td>
        <td><input type="text" name="marca">  </td>
        <td>Placa</td>
        <td><input type="text" name="placa">  </td>
        <td>Modelo</td>
        <td><input type="text" name="modelo">  </td>
    </table>
    <input type="submit" value="Registrar">
</form>
</body>
</html>
