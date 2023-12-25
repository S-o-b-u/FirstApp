public class Chap_5EX_4 {
    //WAP to print the multiplication table of 10 in reverse order
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Reverse table =>");
        for (int i=10; i>=1; i--){
            System.out.printf("%d x %d = %d\n", n,i,n*i);
        }
    }
}