package my.app.controller.command;

import my.app.GlobalConstants;
import my.app.controller.InputUtil;
import my.app.model.services.AddUser;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;


public class CalculateTax implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            if (InputUtil.checkInputData(parameterName, request.getParameter(parameterName))) {
                    return GlobalConstants.WRONG_INPUT_DATA_JSP;
            }
        }
        AddUser.add(request);
        return GlobalConstants.CALCULATE_TAX_JSP;
    }

}
