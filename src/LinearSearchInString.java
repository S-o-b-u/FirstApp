package com.sobu;
import java.util.Scanner;
public class LinearSearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your String here => ");
        String name = in.nextLine();
        System.out.print("Enter the element which you want to search => ");
        char element = in.next().charAt(0);
        if (  search(name, element)==true){
            System.out.println("Yes your element exist in that string!");
        }else {
            System.out.println("NO your element is not exist in that string!");
        }
    }
    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}