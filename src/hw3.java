import java.util.Scanner;

public class hw3 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n;i=i+1) {
            if(i%3==0) {
                System.out.print("A");
            }else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
