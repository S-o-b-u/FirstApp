import java.util.Scanner;

public class Chap_5EX_6 {
    /* WAP to print the following pattern
                * * * *
                * * *
                * *
                *
         using while loop.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your limit => ");
        int n= sc.nextInt();
        int i=0;
        while(i<n){
            int j=0;
            while(j<(n-i)){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
