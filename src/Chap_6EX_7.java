public class Chap_6EX_7 {
    //Create a java program to find the minimum element in a java array.
    public static void main(String[] args) {
        int [] array = {484,664,54,154,1549,55};
        int max = Integer.MAX_VALUE;
        for (int e : array){
            if (e<max){
                max = e;
            }
        }
        System.out.println("The maximum element in that array is : "+ max);
    }
}
