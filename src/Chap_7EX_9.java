import java.util.Scanner;

public class Chap_7EX_9 {
    //Write a function to convert temperature into fahrenheit.
    static int temp (int x){
        return ( (x * 9/5) +32 );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your temperature => ");
        int cel = sc.nextInt();
        int fah = temp(cel);
        System.out.printf("Temperature into Fahrenheit => %d", fah);
    }
}
