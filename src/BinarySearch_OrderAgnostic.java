package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_OrderAgnostic {
    public static void main(String[] args) {
      int[] MyArray={99, 51, 50, 49, 37, 21, 19, 4, 0, -18, -66, -82};
//    int[] MyArray={-45, -31, -22, -9, 1, 5, 12, 29, 37, 42, 56, 69};
        System.out.println("Given Array Is => " + Arrays.toString(MyArray));
        Scanner in = new Scanner(System.in);
        System.out.print("Searching For => ");
        int target = in.nextInt();
        if (OrderAgnosticBS(MyArray, target)==(-1)){
            System.out.println("Sorry your entered integer is not existed in that array!!");
        }else {
            System.out.println("The target is present in " + OrderAgnosticBS(MyArray, target) + "th INDEX!");
        }
    }
    static int OrderAgnosticBS(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        boolean IsAns = arr[start]<=arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (IsAns){
                if (target<arr[mid]){
                    end = mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else{
                if (target>arr[mid]){
                    end = mid-1;
                }
               else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
