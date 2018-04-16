package my.app.model.services;

import my.app.GlobalConstants;
import my.app.model.database.UserDAOImpl;
import my.app.model.entities.User;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;


public class AddUser {
    public static void add(HttpServletRequest request) {
        User user = new User();
        user.setName(request.getParameter(GlobalConstants.NAME));
        user.setSurname(request.getParameter(GlobalConstants.SURNAME));
        user.setIncome(TaxCalculator.calculateIncomeTax(new BigDecimal(request.getParameter(GlobalConstants.INCOME))));
        user.setSales(TaxCalculator.calculateSalesTax(new BigDecimal(request.getParameter(GlobalConstants.SALES))));
        user.setInterest(TaxCalculator.calculateInterestTax(new BigDecimal(request.getParameter(GlobalConstants.INTEREST))));
        user.setGift(TaxCalculator.calculateGiftTax(new BigDecimal(request.getParameter(GlobalConstants.GIFT))));
        UserDAOImpl userDAO = new UserDAOImpl();
        userDAO.addUser(user);
        request.setAttribute(GlobalConstants.SET_ATTRIBUTE_USER, user);
    }
}
