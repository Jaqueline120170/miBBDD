<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Check</title>
</head>
<body>
    <%
        // Verifica si el usuario está autenticado
        String attributo1 = (String) session.getAttribute("attributo1");
        boolean isAuthenticated = attributo1 != null && attributo1.equals("1");
    %>
    
    <c:choose>
        <c:when test="${isAuthenticated}">
            <h2>El usuario está autenticado correctamente.</h2>
        </c:when>
        <c:otherwise>
            <h2>El usuario no está autenticado.</h2>
        </c:otherwise>
    </c:choose>
</body>
</html>