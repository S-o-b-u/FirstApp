import java.util.Scanner;

public class Chap_6EX_4 {
    //Create a java program to add two matrices of size 2x3.
    public static void main(String[] args) {
        int [][] mat1= new int[2][3];
        int [][] mat2= new int[2][3];
        int [][] mat3= new int[2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Matrix_1=>");
        for (int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.printf("[%d][%d]=>",i,j);
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter your Matrix_2=>");
        for (int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.printf("[%d][%d]=>",i,j);
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Final Matrix is=>");
        for (int i=0; i<2; i++){
            for(int j=0; j<3; j++){
               int sum=mat1[i][j]+mat2[i][j];
                System.out.print(" "+sum+"  ");
            }
            System.out.println();
        }
    }
}
