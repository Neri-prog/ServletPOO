<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body style="background-color:powderblue;">
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Rank de Gols</title>
</head>
    <h1>Quantidade de gols</h1>


<div id="container">
    <ul>
        <li>Nome:</li>
        <input value="${nome}" disabled>
        <li>Gols</li>
        <input value="${quantidadeGols}" disabled>
    </ul>
</div>

</body>
</html>