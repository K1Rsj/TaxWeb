package my.app.controller;

import my.app.GlobalConstants;

public class InputUtil {
    public static boolean checkInputNumberData(String data) {
        return data.matches(GlobalConstants.NUMBER_REGEX);
    }

    public static String parseWhiteSpace(String stringForCheck) {
        if (stringForCheck.equals(GlobalConstants.EMPTY_STRING)) {
            return GlobalConstants.ZERO;
        }
        return stringForCheck;
    }

    public static boolean checkInputStringData(String data) {
        return !data.matches(GlobalConstants.NAME_REGEX) || data.equals(GlobalConstants.EMPTY_STRING);
    }
}
