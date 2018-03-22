package pract1;

import java.util.Scanner;

public class Task1 {


    public int inputNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int result;
        while((result = in.nextInt()) <= 0) {
            System.out.println("Enter positive number");
        }
        return result;
    }

    public StringBuffer toBinarySystem(int number) {
        StringBuffer result = new StringBuffer();
        result.append(number % 2);
        while(number > 1) {
            number /= 2;
            result.append(number % 2);
        }
        return result.reverse();
    }

    public StringBuffer toOctalSystem(int number) {
        StringBuffer result = new StringBuffer();
        result.append(number % 8);
        while(number > 8) {
            number /= 8;
            result.append(number % 8);
        }
        return result.reverse();
    }

    public StringBuffer toHexadecimalSystem(int number) {
        StringBuffer result = new StringBuffer();
        result.append(number % 16);
        while(number > 16) {
            number /= 16;
            switch (number % 16) {
                case 10:
                    result.append("A");
                    break;
                case 11:
                    result.append("B");
                    break;
                case 12:
                    result.append("C");
                    break;
                case 13:
                    result.append("D");
                    break;
                case 14:
                    result.append("E");
                    break;
                case 15:
                    result.append("F");
                    break;
                default:
                    result.append(number % 16);
            }
        }
        return result.reverse();
    }

}
