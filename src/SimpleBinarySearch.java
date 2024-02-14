package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleBinarySearch {
    public static void main(String[] args) {
        int[] MyArray={-45, -31, -22, -9, 1, 5, 12, 29, 37, 42, 56, 69};
        System.out.println("Given Array Is => " + Arrays.toString(MyArray));
        Scanner in = new Scanner(System.in);
        System.out.print("Searching For => ");
        int target = in.nextInt();
        if (binarysearch(MyArray, target)==(-1)){
            System.out.println("Sorry your entered integer is not existed in that array!!");
        }else {
            System.out.println("The target is present in " + binarysearch(MyArray, target) + "th INDEX!");
        }
    }
    static int binarysearch(int[] arr, int target){
        int start = 0,mid;
        int end = arr.length - 1;
        while(start<=end){
            mid = start + (end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
