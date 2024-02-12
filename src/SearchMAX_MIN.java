package com.sobu;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMAX_MIN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =0;
        System.out.print("Enter the size of an array =>");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int elment : arr ){
            System.out.print("Enter the value in " +i+"th Index => ");
            arr[i] = in.nextInt();
            i++;
        }
        System.out.println("The array is => "+ Arrays.toString(arr));
        System.out.println("The max element is => "+SearchMax(arr));
        System.out.println("The max element is => "+SearchMin(arr));
    }
   static int SearchMax(int[] array){
        int ans = array[0];
       for (int i = 0; i < array.length; i++) {
            if (ans < array[i]) {
                ans = array[i];
            }
       }
       return ans;
   }

    static int SearchMin(int[] array){
        int ans = array[0];
        for (int i = 0; i < array.length; i++) {
            if (ans > array[i]) {
                ans = array[i];
            }
        }
        return ans;
    }
}
