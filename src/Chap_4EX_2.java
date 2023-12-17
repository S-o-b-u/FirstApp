import java.util.Scanner;

public class Chap_4EX_2 {
    /*
       WAP to find out whether a student is pass or fail; if it requires
       total 40% and at least 33% in each subject to pass. Assume 3 subject
       and take marks as an input from the user.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Full Marks -> 300 -> 100<each>");
        System.out.print("Enter the marks of Subject 1 =>");
        float sub1 = sc.nextFloat();
        System.out.print("Enter the marks of Subject 2 =>");
        float sub2 = sc.nextFloat();
        System.out.print("Enter the marks of Subject 3 =>");
        float sub3 = sc.nextFloat();
        float total = (sub1+sub2+sub3)/300 * 100;
        if(sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("PASSED in each subject!!");
         }else {
            System.out.println(":(");
        }
        if(sub1>=33){
            System.out.println("SUBJECT 1 PASSED/>");
         }else {
            System.out.println("SUBJECT 1 FAILED/<");
        }
        if(sub2>=33){
            System.out.println("SUBJECT 2 PASSED/>");
         }else {
            System.out.println("SUBJECT 2 FAILED/<");
        }
        if(sub3>=33){
            System.out.println("SUBJECT 3 PASSED/>");
         }else {
            System.out.println("SUBJECT 3 FAILED/<");
        }
        if(total>=40){
            System.out.println("<CONGRATULATIONS>, You have passed the exam.");
            System.out.format("And your total percentage is => %.2f", total);
         }else{
            System.out.println("<SORRY>, Better luck next time.");
            System.out.format("And your total percentage is => %f", total);
        }

    }
}
