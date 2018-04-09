package pract8.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Runner {

    public void run() {
        try {
            Class<UnaryArithmeticOperation> operationClass = UnaryArithmeticOperation.class;
            UnaryArithmeticOperation unaryArithmeticOperation =
                    operationClass.getDeclaredConstructor(double.class).newInstance(56.8);
            Field value = operationClass.getDeclaredField("value");
            System.out.println("Old value:\n" + unaryArithmeticOperation);
            value.setAccessible(true);
            value.set(unaryArithmeticOperation, 20.3);
            System.out.println("New value:\n" + unaryArithmeticOperation);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
