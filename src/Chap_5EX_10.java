import java.util.Scanner;

public class Chap_5EX_10 {
    //WAP to find factors of a given number using for loop
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your number => ");
        int n = sc.nextInt();
        System.out.printf("The Factors of the given number %d is => ", n);
        for (int i=1; i<=n; i++){
            if (n%i==0){
                System.out.print(" "+i+" \t ");
            }
        }
    }
}
