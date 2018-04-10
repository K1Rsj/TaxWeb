package my.app.controller;

public class InputUtil {
    static boolean checkInputData(String data) {
        return data.matches("\\d+(.?)\\d*");
    }

    static String parseWhiteSpace(String stringForCheck) {
        if (stringForCheck.equals("")) {
            return "0.0";
        }
        return stringForCheck;
    }
}
