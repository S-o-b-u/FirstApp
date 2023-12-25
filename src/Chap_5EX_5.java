import java.util.Scanner;

public class Chap_5EX_5 {
    //WAP to find factorial of a given number using for loop
    public static void main(String[] args) {
        int mult=1;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your number => ");
        int n = sc.nextInt();
        System.out.printf("The Factorial of the given number %d is => ", n);
        for (int i=1; i<=n; i++){
            mult *= i;
        }
        System.out.print(" "+mult+" ");
    }
}
