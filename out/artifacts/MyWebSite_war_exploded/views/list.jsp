<!DOCTYPE html>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: inputValues
  Date: 02.07.2022
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="ru">
<head>
    <title>Список введённых показаний</title>
    <link rel="stylesheet" href="styles/w3.css">
    <meta charset="UTF-8">
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Список введённых показаний!</h1>
</div>

<div class="w3-container w3-center w3-margin-bottom w3-padding">
    <div class="w3-card-4">
        <div class="w3-container w3-light-blue">
            <h2>Список показаний счётчиков, которые записаны.</h2>
        </div>
        <%
            List<String> values = (List<String>) request.getAttribute("userValues");

            if (values != null && !values.isEmpty()) {
                out.println("<ul class=\"w3-ul\">");
                for (String s : values) {
                    out.println("<li class=\"w3-hover-sand\">" + s + "</li>");
                }
                out.println("</ul>");

            } else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n"
                    +
                    "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                    "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +
                    "   <h5>Никаких показаний счетчиков пока нет!</h5>\n" +
                    "</div>");
        %>
    </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Вернуться на главную страницу со списком счётчиков</button>
</div>
</body>
</html>
