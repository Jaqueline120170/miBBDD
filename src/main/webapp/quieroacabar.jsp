<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession"%>
<%@ page import="jakarta.servlet.http.HttpServletRequest"%>
<%@ page import="jakarta.servlet.http.HttpServletResponse"%>
<%
    String usuario = (String) session.getAttribute("attributo2");
    if (usuario == null) {
        response.sendRedirect("index.jsp");
        return;
    } else if (!usuario.equals("alumno")) {
        response.sendRedirect("bienvenido.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Acceso Restringido</title>
</head>
<body>
    <h1>Bienvenido, Alumno</h1>
    <p>Esta es una página restringida para el usuario logueado como "alumno".</p>
</body>
</html>

