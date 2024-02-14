package com.dsa;
import java.util.Arrays;
import java.util.Scanner;

public class CeilingFinderBS {
    //Ceiling => smallest integer which greater than equal to the target.
    public static void main(String[] args) {
        int[] arr={1, 5, 9, 11, 13, 18, 20};
        Scanner in = new Scanner(System.in);
        System.out.println("Given Array Is => "+Arrays.toString(arr));
        System.out.print("Enter the target=> ");
        int target = in.nextInt();
        int ceiling = arr[Ceiling(arr, target)];
        System.out.println("The ceiling of the target is in => "+Ceiling(arr, target)+"th INDEX! and the num is "+ceiling);
    }
    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (target<arr[mid]) {
                end = mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
