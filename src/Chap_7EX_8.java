import java.util.Scanner;

public class Chap_7EX_8 {
    /* WAP using recursive function to print the following pattern
                *
                * *
                * * *
                * * * *
          */
    static int pattern (int x){
        if (x>0){
            pattern(x-1);
            for (int i=0; i<x; i++){
                System.out.printf("* ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of rows => ");
        int n = sc.nextInt();
        pattern(n);
    }
}


