package pract3.task3;

import java.util.HashMap;
import java.util.Map;

public class MyEnum<E extends MyEnum<E>> {

    private static int ordinalCounter = 0;

    private final String name;
    private final int ordinal;
    private static Map<String, MyEnum> enums = new HashMap<>();

    private MyEnum(String name) {
        this.name = name;
        this.ordinal = ordinalCounter++;
        enums.put(name, this);
    }

    public static final MyEnum ORANGE = new MyEnum("ORANGE");
    public static final MyEnum RED = new MyEnum("RED");
    public static final MyEnum BLACK = new MyEnum("BLACK");
    public static final MyEnum WHITE = new MyEnum("WHITE");

    public final String getName() {
        return this.name;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public static MyEnum valueOf(String name) {
        MyEnum result = enums.get(name);
        if (result != null)
            return enums.get(name);
        else
            throw new NullPointerException("Name is null");
    }

    @Override
    public String toString() {
        return name;
    }
}
