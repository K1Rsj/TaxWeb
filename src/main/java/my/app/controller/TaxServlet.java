package my.app.controller;

import my.app.GlobalConstants;
import my.app.controller.command.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.*;

public class TaxServlet extends HttpServlet {
    private Map<String, Command> commands = new HashMap<>();

    @Override
    public void init() {
        commands.put(GlobalConstants.INPUT_INCOME_COMMAND, new InputIncome());
        commands.put(GlobalConstants.GET_ALL_USERS_COMMAND, new GetAllUsers());
        commands.put(GlobalConstants.CALCULATE_TAX_COMMAND, new CalculateTax());
        commands.put(GlobalConstants.WRONG_INPUT_DATA_COMMAND, new WrongInputData());
        commands.put(GlobalConstants.SORT_ALL_USERS_COMMAND, new SortAllUsers());
    }

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

        String path = request.getRequestURI();
        path = path.replaceAll(GlobalConstants.PATH_CLEAN_REGEX , GlobalConstants.EMPTY_STRING);
        Command command = commands.getOrDefault(path , r ->GlobalConstants.INDEX_JSP);
        String page = command.execute(request);
        request.getRequestDispatcher(page).forward(request, response);

    }
}
