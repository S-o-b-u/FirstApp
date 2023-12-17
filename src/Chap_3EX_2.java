import java.util.Scanner;

public class Chap_3EX_2 {
    //WAP to replace spaces with underscores.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string => ");
        String str = sc.nextLine();
        String rpl = str.replace(" ", "_");
        System.out.println(rpl);
    }
}
