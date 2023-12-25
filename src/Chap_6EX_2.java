import java.util.Scanner;

public class Chap_6EX_2 {
    //WAP to find out whether a given integer is present in an array or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your integer =>");
        int integer = sc.nextInt();
        int [] arr = {2,4,8,68,2,7,11,6,64};
       boolean isarray = false;
       for (int element : arr) {
           if (integer == element) {
               isarray = true;
               break;
           }
       }
           if (isarray){
               System.out.println("integer is present");
           }
           else {
               System.out.println("integer is not present");
           }
    }
}

