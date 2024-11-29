<%-- 
    Document   : borrar
    Created on : 02/07/2024, 02:03:43 PM
    Author     : AUTORIZADO
--%>
<% 
String m=request.getParameter("x");

%>
<jsp:useBean id="control" scope="page" class="controlador.Control" />


<% String mensaje=control.anula(m);  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Se anulo el producto</h1>
        <%=mensaje%>
    </body>
</html>
