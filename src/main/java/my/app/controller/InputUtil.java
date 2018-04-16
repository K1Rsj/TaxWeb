package my.app.controller;

import my.app.GlobalConstants;

public class InputUtil {

    public static boolean checkInputData(String nameOfParameter, String parameter) {
        if (nameOfParameter.contains("name")) {
            return checkInputStringData(parameter);
        }
        else {
            return checkInputNumberData(parameter);
        }
    }

    public static boolean checkInputNumberData(String data) {
        return !data.matches(GlobalConstants.NUMBER_REGEX);
    }


    public static boolean checkInputStringData(String data) {
        return !data.matches(GlobalConstants.NAME_REGEX) || data.equals(GlobalConstants.EMPTY_STRING);
    }
}
