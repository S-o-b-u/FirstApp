import java.util.Scanner;

public class Chap_5EX_2 {
    //WAP to sum first n even numbers using while loop
    public static void main(String[] args) {
       int i=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your limit =>");
        int n = sc.nextInt();
       while (i<=n){
           sum+=(i*2);
           System.out.println(" "+(i*2)+" ");
           i++;
       }
        System.out.println("===============================");
        System.out.println("Total SUM of nth numbers =>"+sum+" ");
    }
}
