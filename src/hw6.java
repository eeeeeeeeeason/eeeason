import java.util.Scanner;

public class hw6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        for (int i = n; i <= m; i++) {
            for (int j = n; j <= m; j++) {
                System.out.print(i * j);
            }
            System.out.println();
        }


    }
}
    