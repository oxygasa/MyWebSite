package app.servlets;

import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ListServlet extends HttpServlet {
    //Моя динамическая страница теперь умеет получать и отправлять GET запросы
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //На странице /list отобразятся пользователи, которые добавлены через /add
        Model model = Model.getInstance();
        List<String> values = model.list();
        resp.setCharacterEncoding("UTF-8");
        req.setAttribute("userValues", values);
        //Заставляю этот метод открывать web/views/list.jsp явно.
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(req, resp);
    }
}
