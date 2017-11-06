import java.util.Scanner;

public class hw2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i = i + 1) {
                sum = sum + i;
            }
            System.out.println(sum);

        }
    }
}