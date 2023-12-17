import java.util.Scanner;

public class Chap_3EX_1 {
    //WAP to convert a string to lowercase.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your STRING => ");
        String str = sc.nextLine();
        String LCS = str.toLowerCase();
        System.out.println("The string converted into lowercase : " );
        System.out.println(LCS);
    //Added the uppercas>
        String UCS = str.toUpperCase();
        System.out.println("The string converted into uppercase : " );
        System.out.println(UCS);
    }
}
