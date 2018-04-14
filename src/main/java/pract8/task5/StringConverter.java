package pract8.task5;

@FunctionalInterface
public interface StringConverter {

    String convert(String string);

    default boolean checkString(String string) {
        if (string == null)
            return false;
        return  true;
    }
}
