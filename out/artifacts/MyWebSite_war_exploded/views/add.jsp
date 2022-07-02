<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="ru">
<head>
    <title>Добавить новое показание</title>
    <link rel="stylesheet" href="styles/w3.css">
    <meta charset="UTF-8">
</head>

<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Что показывает счётчик электроэнергии?</h1>
</div>

<div class="w3-container w3-padding">
    <%
        if (request.getAttribute("userValues") != null) {
            out.println("<p>Показание счётчика " + request.getAttribute("userValues") + " добавлено!</p>");
        out.println("<p>Внизу есть кнопка для возвращения на главную страницу</p>");
        }
    %>
    <div class="w3-card-4">
        <div class="w3-container w3-left-align w3-green">
            <h2>Написать показание</h2>
        </div>

        <form method="post" class="w3-selection w3-light-grey w3-padding">
            <label>Киловатт-часов:
                <input type="text" name="value" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
            </label>
            <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Подтвердить</button>
        </form>
    </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Вернуться на главную страницу со списком счётчиков</button>
</div>
</body>
</html>