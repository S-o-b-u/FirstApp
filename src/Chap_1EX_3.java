import java.util.Scanner;
public class Chap_1EX_3 {
    //WAP to calculate CGPA using marks of three subjects(out of 100)
        public static void main(String[] args) {
            System.out.println("==CGPA==");
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTER GRADE OF THE SUBJECT ONE = ");
            float s1=sc.nextFloat();
            System.out.print("ENTER GRADE OF THE SUBJECT TOW = ");
            float s2=sc.nextFloat();
            System.out.print("ENTER GRADE OF THE SUBJECT THREE = ");
            float s3=sc.nextFloat();
            float cgpa = (s1+s2+s3)/3;
            System.out.println(" TOTAL CGPA = "+cgpa+" ");
        }
    }


