package my.app.model.services;

import my.app.GlobalConstants;
import my.app.model.database.UserDAOImpl;
import my.app.model.entities.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class SortAllUsersByName {
    public static void sort(HttpServletRequest request) {
        UserDAOImpl userDAO = new UserDAOImpl();
        List<User> allUsers = userDAO.getAllUsers();
        request.setAttribute(GlobalConstants.SET_ATTRIBUTE_USERS, allUsers);
        allUsers.sort(new UserNameComparator());
    }
}
