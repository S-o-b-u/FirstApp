import java.util.Scanner;

public class Chap_4EX_3 {
    /*   calculate income tax paid by an employee to
         the government as per the slabs mentioned below,
                       INCOME SALE       TAX
                       2.5L - 5.0L       5%
                       5.0L - 10.0L      20%
                       Above 10.0L       30%
         Note that there is no tax below 2.5L.Take
         input amount as an input from the user.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell me about your income ?? => "); //like - 1.2L,2,2L...
        float inc = sc.nextFloat();
        if(inc < 2.5){
            System.out.println("No need to pay TAXES");
        }
         else if (inc > 2.5 && inc < 5.0){
            System.out.println("You need to pay 5% TAX");
        }
          else if (inc > 5.0 && inc < 10.0){
            System.out.println("You need to pay 20% TAX");
        }
           else{
            System.out.println("You need to pay 30% TAX");
        }

    }
}
