import java.util.Scanner;

public class Chap_3EX_4 {
    //WAP tp detect double and triple spaces in a string.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string => ");
        String str = sc.nextLine();
        System.out.println("DETECTING '  '\\'   '");
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
    }
}
