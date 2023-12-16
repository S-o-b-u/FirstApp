import java.util.Scanner;
public class Chap_1EX_1 {
    /* Write a program to calculate percentage of a given student in CBSE board exam.
His marks from 5 subjects must be taken as input from the keyboard .(Marks are out of 100) */

    public static void main(String[] args) {
        System.out.println("==CBSE BOARD Result==");
        float numofsub = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Full MARKS=>");
        float sub = sc.nextFloat();
        System.out.print("Enter Marks OF English =>");
        float eng = sc.nextFloat();
        System.out.print("Enter Marks OF Bengali =>");
        float beng = sc.nextFloat();
        System.out.print("Enter Marks OF Maths =>");
        float math = sc.nextFloat();
        System.out.print("Enter Marks OF Physics =>");
        float phs = sc.nextFloat();
        System.out.print("Enter Marks OF Chemistry =>");
        float chem = sc.nextFloat();
        float SUM = (eng + beng + math + phs + chem);
        float total = (sub * numofsub);
        float Percentage = (SUM / total) * 100;
        System.out.print("You Scored =>" + Percentage + "% in Total");
    }
}
