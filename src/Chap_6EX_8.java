public class Chap_6EX_8 {
    //WAP in java to find whether an array is sorted or not
    public static void main(String[] args) {
        int [] arr ={1,2,6,43,254,412};
        boolean IsSorted =true;
        for (int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                IsSorted = false;
            }
        }
        if(IsSorted){
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }

}
