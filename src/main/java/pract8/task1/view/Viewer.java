package pract8.task1.view;

public class Viewer {

    public static final String MENU = "1. Использовать строку по умолчанию.\n" +
            "2. Ввести строку с клавиатуры.\n" +
            "3. Изменить значение строки.\n" +
            "4. Показать значение строки.\n" +
            "5. Выход.";
    public static final String INPUT_STRING = "Введите исходную строку:";
    public static final String INPUT_REPLACEMENT_STRING = "Введите строку для замены:";
    public static final String STRING_IS_CHANGED = "Строку изменено.";
    public static final String CURRENT_STRING = "Значение строки:";
    public static final String STRING_NOT_CHANGED = "Ошибка! Строку не изменено.";
    public static final String INPUT_ERROR = "Ошибка ввода!";

    public void showString(String str) {
        System.out.println(str);
    }

}
