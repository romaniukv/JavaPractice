package pract8.task5;

public class Task5 {

    public static String convertToUpperCase(String str) {
        StringConverter stringConverter = (String::toUpperCase);
        return stringConverter.convert(str);
    }
}
