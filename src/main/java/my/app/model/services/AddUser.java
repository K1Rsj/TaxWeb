package my.app.model.services;

import my.app.GlobalConstants;
import my.app.model.database.UserDAOImpl;
import my.app.model.entities.User;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.HashMap;

public class AddUser {
    public static void add(HttpServletRequest request, HashMap<String, BigDecimal> result) {
        User user = new User();
        user.createTaxSheet(result);
        user.setName(request.getParameter(GlobalConstants.NAME));
        user.setSurname(request.getParameter(GlobalConstants.SURNAME));
        UserDAOImpl userDAO = new UserDAOImpl();
        userDAO.addUser(user);
        request.setAttribute(GlobalConstants.SET_ATTRIBUTE_USER, user);
    }
}
