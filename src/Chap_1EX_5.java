import java.util.Scanner;
public class Chap_1EX_5 {
    //WAP in java to convert kilometers to miles
    public static void main(String[] args) {
        System.out.println("==KILOMETER TO MILES==");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER VALUE = ");
        double k = sc.nextDouble();
        double miles = k * 0.621371;
        System.out.println("VALUE IN MILES IS = " + miles + " ");
    }
}
