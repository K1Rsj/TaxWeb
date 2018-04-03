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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HashMap<String, BigDecimal> result = new HashMap<>();
        PrintWriter writer = response.getWriter();
        TaxSheet taxSheet = new TaxSheet();
        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            String parameterValue = parseWhiteSpace(request.getParameter(parameterName));
            if (checkInputData(parameterValue)) {
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

    private boolean checkInputData(String data) {
        return data.matches("\\d+(.?)\\d*");
    }

    private String parseWhiteSpace(String stringForCheck) {
        if (stringForCheck.equals("")) {
            return "0.0";
        }
        return stringForCheck;
    }

}
