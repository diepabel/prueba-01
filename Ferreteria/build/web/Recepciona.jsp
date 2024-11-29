<%-- 
    Document   : Recepciona
    Created on : 02/07/2024, 02:03:11 PM
    Author     : AUTORIZADO
--%>
<%
    String id=request.getParameter("a");
    String nombre=request.getParameter("b");
    String marca=request.getParameter("c");
    int cantidad=Integer.parseInt(request.getParameter("d"));
    java.sql.Date fecha_ingreso = java.sql.Date.valueOf(request.getParameter("e")) ;   
    double precio=Double.parseDouble(request.getParameter("f"));
%>

<jsp:useBean id="control" scope="page" class="controlador.Control" />

<% String respuesta =control.registrarProducto(id, nombre, marca, cantidad, fecha_ingreso, precio); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado del registro del producto</h1>
        <%=respuesta%>
    </body>
</html>
