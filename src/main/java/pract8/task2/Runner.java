package pract8.task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {

    public void run() {
        try {
            Class<UnaryArithmeticOperation> operationClass = UnaryArithmeticOperation.class;
            UnaryArithmeticOperation unaryArithmeticOperation =
                    operationClass.getDeclaredConstructor(double.class).newInstance(56.8);
            System.out.println("Old value:\n" + unaryArithmeticOperation);
            Method method = operationClass.getDeclaredMethod("setValue", double.class);
            method.invoke(unaryArithmeticOperation, 20.3);
            System.out.println("New value:\n" + unaryArithmeticOperation);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
