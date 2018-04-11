package my.app.controller;

import my.app.model.entities.User;
import my.app.model.entities.UserComparator;
import my.app.model.database.UserDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;

public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HashMap<String, BigDecimal> result = new HashMap<>();
        PrintWriter writer = response.getWriter();
        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            if (parameterName.equals("name") || parameterName.equals("surname")) {
                continue;
            }
            String parameterValue = InputUtil.parseWhiteSpace(request.getParameter(parameterName));
            if (InputUtil.checkInputNumberData(parameterValue)) {
                result.put(parameterName, new BigDecimal(parameterValue));
            } else {
                request.getRequestDispatcher("WrongInputData.html").forward(request, response);
            }
        }

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        while (InputUtil.checkInputStringData(name) || InputUtil.checkInputStringData(surname)) {
            request.getRequestDispatcher("WrongInputData.html").forward(request, response);
        }
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.createTaxSheet(result);
        UserDAOImpl userDAO = new UserDAOImpl();
        userDAO.addUser(user);
        List<User> allUsers = userDAO.getAllUsers();
        allUsers.sort(new UserComparator());

        for (User s : allUsers) {
            writer.println(s);
            writer.println("<br>");
        }
    }
}
