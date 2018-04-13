package my.app.controller.command;

import my.app.GlobalConstants;
import my.app.model.services.SortAllUsersByName;

import javax.servlet.http.HttpServletRequest;

public class SortAllUsers implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        SortAllUsersByName.sort(request);
        return GlobalConstants.SORT_ALL_USERS_JSP;
    }

}
