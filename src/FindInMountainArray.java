package com.sobu;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target){
        int peak = FindPeakElement(arr);
        int InLeft = orderagnosticBS(arr, target,0, peak );
        if (InLeft!=-1){
            return InLeft;
        }else
            return orderagnosticBS(arr,target,peak+1,arr.length-1);
    }
    public static int FindPeakElement(int[] arr){
        int start =0;
        int end =arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int orderagnosticBS(int[] arr, int target, int start, int end){
        boolean IsAsc=(arr[start]<=arr[end]);
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (IsAsc) {
                if (target<arr[mid]){
                    end=mid-1;
                } else  {
                    start=mid+1;
                }
            }else {
                if (target>arr[mid]){
                    end=mid-1;
                } else  {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}