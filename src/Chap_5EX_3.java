import java.util.Scanner;

public class Chap_5EX_3 {
    //WAP to print multiplication table of a given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to create the table => ");
        int n = sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.printf("%d x %d => %d\n", n,i,(n*i));
        }
    }
}
