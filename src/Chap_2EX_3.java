import java.util.Scanner;

public class Chap_2EX_3 {
    //Use comparison operators to find out whether a given is greater than the user entered number or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number =>");
        int a = sc.nextInt();
        System.out.println("Greater!? ["+(a>10)+"] ");
    }
}
