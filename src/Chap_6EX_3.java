import java.util.Scanner;
public class Chap_6EX_3 {
    /* Calculate the average marks from an array containing,
       marks of all students in physics using for-each loop. */
    public static void main(String[] args) {
        float [] marks = {90.5f,82,69.6f,73,98};
        float sum=0;
        for (float element : marks){
            sum+=element;
        }
        System.out.println("Total average marks =>"+(sum/marks.length)+" ");
    }
}
