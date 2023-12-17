import java.util.Scanner;

public class Chap_4EX_4 {
    /* WAP to find out the day of the week given the number
       [ 1 for MONDAY, 2 for TUESDAY,...and so on! ]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7 => ");
        int a = sc.nextInt();
        switch(a){
            case 1 :
                System.out.println("It's MONDAY");
                break;
            case 2 :
                System.out.println("It's TUESDAY");
                break;
            case 3 :
                System.out.println("It's WEDNESSDAY");
                break;
            case 4 :
                System.out.println("It's THURSDAY");
                break;
            case 5 :
                System.out.println("It's FRIDAY");
                break;
            case 6 :
                System.out.println("It's SATURDAY");
                break;
            case 7 :
                System.out.println("It's SUNDAY");
                break;
        }

    }
}
