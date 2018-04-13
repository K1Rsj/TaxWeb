package my.app.controller.command;

import my.app.GlobalConstants;

import javax.servlet.http.HttpServletRequest;

public class InputIncome implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return GlobalConstants.INPUT_INCOME_JSP;
    }
}
