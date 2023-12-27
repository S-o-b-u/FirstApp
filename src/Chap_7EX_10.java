import java.util.Scanner;

public class Chap_7EX_10 {
    ////Write a function with iterative approach to calculate sum of first n natural numbers
    static int sum(int x){
        int s =0;
        for (int i=0; i<=x; i++){
            s += i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth number here => ");
        int n = sc.nextInt();
        int c = sum(n);
        System.out.printf("Toatl sum => %d", c);
    }
}
