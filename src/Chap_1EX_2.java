import java.util.Scanner;
public class Chap_1EX_2 {
    //Write a program to sum three numbers in java
        public static void main(String[] args) {
            int n1, n2, n3;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number 1 = ");
            n1 = sc.nextInt();
            System.out.print("Enter Number 2 = ");
            n2 = sc.nextInt();
            System.out.print("Enter Number 3 = ");
            n3 = sc.nextInt();
            int sum = n1+n2+n3;
            System.out.println("The Total SUM Of Three Numbers Is "+sum+" ");
        }
    }