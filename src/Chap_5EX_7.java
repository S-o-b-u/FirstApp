import java.util.Scanner;

public class Chap_5EX_7 {
    //WAP to find factorial of a given number using while loop.
    public static void main(String[] args) {
        int i=1,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number => ");
        int n = sc.nextInt();
        System.out.printf("The factorials of the given number => ");
        while(i<=n){
            fact*=i;
            System.out.print(" "+fact+" \t ");
            i++;
        }
    }
}
