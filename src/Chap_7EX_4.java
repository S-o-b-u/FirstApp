import java.util.Scanner;

public class Chap_7EX_4 {
    /* Write a function to print the following pattern
                   * * * *
                   * * *
                   * *
                   *
     */
    static int pattern(int x){
        for (int i=0; i<x; i++){
            for (int j=0; j<x-i; j++){
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
