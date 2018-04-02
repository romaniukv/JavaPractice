package pract5.task2;

import java.util.Scanner;

public class Runner {

    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество чисел:");
        int numOfNumbers = in.nextInt();
        in.nextLine();
        System.out.println("Введите диапазон генерируемых чисел [a, b]:");
        System.out.print("a = ");
        int a = in.nextInt();
        in.nextLine();
        System.out.print("b = ");
        int b = in.nextInt();
        in.nextLine();

        Generator generator = new Generator();
        generator.generate(numOfNumbers, a, b);
        System.out.println("List: " + generator.getList());
        System.out.println("Set: " + generator.getSet());
    }
}
