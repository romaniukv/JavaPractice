package pract8.task5;

public class Task5 {

    public static String convertToUpperCase(String str) {
        StringConverter stringConverter = (String::toUpperCase);
        if (stringConverter.checkString(str))
            return stringConverter.convert(str);
        return "";
    }
}
