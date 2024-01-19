<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
    <title>Administrar Autos</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<a href="servletController?opcion=registro">Agregar auto</a>
<br/>
<table border="1">
    <tr>
        <th>Marca </th>
        <th>Placa </th>
        <th>Modelo </th>
        <th colspan="2">Acciones</th>


    </tr>
    <c:forEach var="auto" items="${autos}">
        <tr>
            <td><c:out value="${auto.marca}"></c:out></td>
            <td><c:out value="${auto.placa}"></c:out></td>
            <td><c:out value="${auto.modelo}"></c:out></td>
            <td>Editar</td>
            <td><a href="servletController?opcion=eliminar&placa=<c:out value="${auto.placa}"></c:out>">Eliminar</a> </td>

        </tr>
    </c:forEach>
</table>

<a href="hello-servlet">Hello Servlet</a>
</body>
</html>