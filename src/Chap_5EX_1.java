import java.util.Scanner;

public class Chap_5EX_1 {
    /* WAP to print the following pattern
             * * * *
             * * *
             * *
             *
        using for loop.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows =>");
        int row = sc.nextInt();

        for (int i=0; i<row; i++){
            for (int j=0; j<row-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
