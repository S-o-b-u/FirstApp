import java.util.Scanner;

public class Chap_7EX_3 {
    //Write a recursive function to calculate sum of first n natural numbers
    static int sum(int x){
         if (x==1){
             return 1;
         }
         return x + sum(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth number here => ");
        int n = sc.nextInt();
        int c = sum(n);
        System.out.println(c);
    }
}
