package app.servlets;

import app.entities.InputValues;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet2 extends HttpServlet {
    //Моя динамическая страница теперь умеет получать и отправлять GET запросы
    //Заставляю этот метод открывать web/views/add.jsp явно.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add2.jsp");
        requestDispatcher.forward(req, resp);
    }

    //Моя динамическая страница теперь умеет ловить значения из POST запроса
    //Введённые имя и пароль прилетят в этот метод
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("value");
        String secretCode = req.getParameter("secretCode");
        InputValues inputValues = new InputValues(value, secretCode);
        Model model = Model.getInstance();
        model.add(inputValues);
        resp.setCharacterEncoding("UTF-8");
        req.setAttribute("userValues", value);
        doGet(req, resp);
    }
}