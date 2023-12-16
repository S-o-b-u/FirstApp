import java.util.Scanner;
public class Chap_1EX_6 {
    /*WAP in java to detect whether a number
      entered by the user is integer or not without any condition*/
        public static void main(String[] args) {
            System.out.print("ENTER A NUMBER = ");
            Scanner sc = new Scanner(System.in);
            System.out.println(sc.hasNextInt());
        }
    }