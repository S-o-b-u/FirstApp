import java.util.Scanner;

public class Chap_7EX_1 {
    //WAP in java method to print multiplication table of a number n.
    static int table (int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + "x" + i + "=" + (x * i));
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter your number to create the table :");
        int n = sc.nextInt();
        System.out.println("==TABLE==");
        table(n);

    }
}
