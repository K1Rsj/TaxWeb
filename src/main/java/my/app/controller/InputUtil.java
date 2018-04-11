package my.app.controller;

public class InputUtil {
    static boolean checkInputNumberData(String data) {
        return data.matches("\\d+(.?)\\d*");
    }

    static String parseWhiteSpace(String stringForCheck) {
        if (stringForCheck.equals("")) {
            return "0.0";
        }
        return stringForCheck;
    }

    static boolean checkInputStringData(String data) {
        return !data.matches("^[А-Яа-яa-zA-ZЁёЇїІіЄєҐґ]+[А-Яа-яa-zA-ZЁёЇїІіЄєҐґ']+$") || data.equals("");
    }
}
