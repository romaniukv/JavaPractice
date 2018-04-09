package pract8.task1.model;

import java.lang.reflect.Field;

public class StringReplacer {

    private String string;

    public boolean replaceString(String newString) {
        try {
            Field value = string.getClass().getDeclaredField("value");
            value.setAccessible(true);
            value.set(string, newString.toCharArray());
            return true;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
