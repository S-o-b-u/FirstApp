public class Chap_6EX_1 {
    //Create an array of 5 floats and calculate their sum
    public static void main(String[] args) {
       float [] fl = {2.3f, 4.5f, 5.4f, 1.9f, 3.5f};
       float sum=0;
       for (int i=0; i<5; i++){
           sum+=fl[i];
       }
        System.out.println("The sum => "+sum+" ");
    }
}
