package pract1;

public class Task3 {

    public void showPiramid(int n) {
        int numOfSpace = n - 1;
        int num;
        for (int i = 0; i < n; i++){
            num = 1;
            for (int j = 0; j < numOfSpace; j++)
                System.out.print(" ");
            for (int m = numOfSpace; m < n; m++)
                System.out.print(num++);
            --num;
            for (int k = n - 1; k < 2 * n - 2 - numOfSpace; k++)
                System.out.print(--num);
            numOfSpace -= 1;
            System.out.println();
        }
    }
}
