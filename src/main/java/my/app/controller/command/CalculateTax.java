package my.app.controller.command;

import my.app.GlobalConstants;
import my.app.controller.InputUtil;
import my.app.model.services.AddUser;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.HashMap;


public class CalculateTax implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        HashMap<String, BigDecimal> result = new HashMap<>();
        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            if (parameterName.equals(GlobalConstants.NAME) || parameterName.equals(GlobalConstants.SURNAME)) {
                continue;
            }
            String parameterValue = InputUtil.parseWhiteSpace(request.getParameter(parameterName));
            if (InputUtil.checkInputNumberData(parameterValue)) {
                result.put(parameterName, new BigDecimal(parameterValue));
            } else {
                return GlobalConstants.WRONG_INPUT_DATA_JSP;
            }
        }
        if (InputUtil.checkInputStringData(request.getParameter(GlobalConstants.NAME)) || InputUtil.checkInputStringData(request.getParameter(GlobalConstants.SURNAME))) {
            return GlobalConstants.WRONG_INPUT_DATA_JSP;
        }
        AddUser.add(request, result);

        return GlobalConstants.CALCULATE_TAX_JSP;
    }

}
