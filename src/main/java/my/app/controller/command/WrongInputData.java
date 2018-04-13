package my.app.controller.command;

import my.app.GlobalConstants;

import javax.servlet.http.HttpServletRequest;

public class WrongInputData implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return GlobalConstants.WRONG_INPUT_DATA_JSP;
    }
}
