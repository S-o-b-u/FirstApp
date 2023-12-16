public class Chap_2EX_2{
    //WAP to encrypt a grade by adding 8 to it & then decrypt it to show the correct grade.
    public static void main(String[] args) {
        //encrypt the grade
        char a = (char)('B'+ 8);
        System.out.println("Your Grade Is => "+a+" ");
        //decrypt the grade
        a = (char)(a-8);
        System.out.println("Decrypted Grade => "+a+" ");
    }
}