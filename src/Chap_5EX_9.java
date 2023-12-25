import java.util.Scanner;

public class Chap_5EX_9 {
    //WAP to calculate the sum of the numbers occuring in the multiplication table of 8
    public static void main(String[] args) {
        int n=8,sum=0;
        for (int i=1; i<=10; i++){
            System.out.printf("%d x %d => %d\n", n,i,(n*i));
            sum+=(n*i);
        }
        System.out.println("The sum => "+sum+" ");
    }
}
