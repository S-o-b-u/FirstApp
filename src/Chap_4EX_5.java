import java.util.Scanner;

public class Chap_4EX_5 {
    //WAP to find whether a year entered by the user is a leap year or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year to observe => ");
        int year = sc.nextInt();
        if(year % 400 == 0){
            System.out.println("LEAP YEAR");
        }else if (year % 100 == 0){
            System.out.println("NOT A LEAP YEAR");
        }else if (year % 4 == 0){
            System.out.println("LEAP YEAR");
        }else {
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
