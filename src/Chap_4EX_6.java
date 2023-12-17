import java.util.Scanner;

public class Chap_4EX_6 {
    /*  WAP to find out the type of website from the url,
            .com -> Commercial website
            .org -> Organisation website
            .in -> indian website
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR WEBSITE URL => ");
        String wb = sc.nextLine();
        if (wb.endsWith(".com")){
            System.out.println("It's a Commercial website!");
        } else if (wb.endsWith(".org")){
            System.out.println("It's a Organisation website!");
        } else if (wb.endsWith(".in")){
            System.out.println("It's a indian website!");
        }
    }
}
