import java.util.Scanner;

public class Chap_7EX_5 {
    //Write a function to print nth term of fibonacci series using recursion
    static int fib(int n){
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your limit => ");
        int a = sc.nextInt();
        int result = fib(a);
        System.out.println(result);
    }
}
