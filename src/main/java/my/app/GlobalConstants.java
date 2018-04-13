package my.app;

public interface GlobalConstants {
    String NAME = "name";
    String SURNAME = "surname";
    String WRONG_INPUT_DATA_JSP = "/wrongInputData.jsp";
    String CALCULATE_TAX_JSP = "/calculateTax.jsp";
    String GET_ALL_USERS_JSP = "/getAllUsers.jsp";
    String INPUT_INCOME_JSP = "/inputIncome.jsp";
    String SORT_ALL_USERS_JSP = "/sortAllUsers.jsp";
    String CONTENT_TYPE_TEXT_HTML = "text/html";
    String UTF8 = "UTF-8";
    String NUMBER_REGEX = "\\d+(.?)\\d*";
    String NAME_REGEX = "^[А-Яа-яa-zA-ZЁёЇїІіЄєҐґ]+[А-Яа-яa-zA-ZЁёЇїІіЄєҐґ']+$";
    String ZERO = "0.0";
    String EMPTY_STRING = "";
    String INPUT_INCOME_COMMAND = "inputIncome";
    String GET_ALL_USERS_COMMAND = "getAllUsers";
    String CALCULATE_TAX_COMMAND = "calculateTax";
    String WRONG_INPUT_DATA_COMMAND = "wrongInputData";
    String SORT_ALL_USERS_COMMAND = "sortAllUsers";
    String PATH_CLEAN_REGEX = ".*/app/";
    String INDEX_JSP = "/index.jsp";
    String DB_PROPERTIES = "db.properties";
    String MYSQL_DRIVER = "driver";
    String DB_URL = "url";
    String DB_USER = "user";
    String DB_PASSWORD = "password";
    String USER_ID = "id";
    String GIFT = "gift";
    String INCOME = "income";
    String INTEREST = "interest";
    String SALES = "sales";
    String SET_ATTRIBUTE_USER = "user";
    String SET_ATTRIBUTE_USERS = "users";
}
