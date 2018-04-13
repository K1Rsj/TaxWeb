package my.app.controller.command;

import my.app.GlobalConstants;

import javax.servlet.http.HttpServletRequest;

import static my.app.model.services.GetAllUsers.*;

public class GetAllUsers implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        getAll(request);
        return GlobalConstants.GET_ALL_USERS_JSP;
    }

}
