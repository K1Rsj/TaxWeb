package my.app.controller;

import my.app.model.TaxSheet;
import my.app.model.Tax;

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
        TaxSheet taxSheet = new TaxSheet();
        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            String parameterValue = InputUtil.parseWhiteSpace(request.getParameter(parameterName));
            if (InputUtil.checkInputData(parameterValue)) {
                result.put(parameterName, new BigDecimal(parameterValue));
            }
            else {
                request.getRequestDispatcher("WrongInputData.html").forward(request, response);
            }
        }
        taxSheet.setInputData(result);
        taxSheet.createTaxSheet();
        for (Tax s : taxSheet.getOutputData()) {
            writer.println(s);
        }

    }

}
