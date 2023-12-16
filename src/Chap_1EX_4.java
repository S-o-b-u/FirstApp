import java.util.Scanner;
public class Chap_1EX_4 {
    /*WAP in java which asks the user to enter hir/her name and greets them
     with "Hello <name>, have a good day"text.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NAME : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day :)");
    }
}