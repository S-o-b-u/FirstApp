public class Chap_7EX_6 {
    //Write a function to find average of a set of numbers passed as arguments
    static float avg (float ...arr){
        float sum=0;
        for (float e : arr){
            sum+=e;
        }
        return sum/2;
    }
    public static void main(String[] args) {
        System.out.println(avg(1,2,3,4,5));
    }
}
