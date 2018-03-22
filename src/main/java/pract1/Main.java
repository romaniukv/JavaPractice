package pract1;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Task1");
        Task1 task1 = new Task1();
//        int number = task1.inputNumber();
//        System.out.println("In binary system: " + task1.toBinarySystem(number));
//        System.out.println("In octal system: " + task1.toOctalSystem(number));
//        System.out.println("In hexadecimal system: " + task1.toHexadecimalSystem(number));

//        System.out.println("Task2");
//        int n = task1.inputNumber();
//        Task2 task2 = new Task2();
//        System.out.println(task2.find(n));

        System.out.println("Task4");
        int n = task1.inputNumber();
        Task4 task4 = new Task4();
        task4.rotateMatrix(n);

//        System.out.println("Task3");
//        n = task1.inputNumber();
//        Task3 task3 = new Task3();
//        task3.showPiramid(n);
    }
}
