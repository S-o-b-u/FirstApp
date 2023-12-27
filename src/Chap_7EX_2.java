import java.util.Scanner;

public class Chap_7EX_2 {
    /* WAP using function to print the following pattern
              *
              * *
              * * *
              * * * *
     */
    static int pattern (int x){
        for (int i=0; i<x; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows => ");
        int row = sc.nextInt();
        pattern(row);
    }
}
