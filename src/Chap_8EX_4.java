import java.util.Scanner;

//Create a class rectangle with a method to initialize its side, calculating area, parameter etc.
class rectangle{
    int length;
    int breath;
    public void initialize1 (int y){
        length = y;
    }
    public void initialize2 (int x){
        breath = x;
    }
    public int area(){
        return (length*breath);
    }
    public int parameter(){
        return 2 * (length + breath);
    }
}
public class Chap_8EX_4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        rectangle ac = new rectangle();
        System.out.print("Enter a LENGTH of the square => ");
        int length = sc.nextInt();
        System.out.print("Enter a BREATH of the square => ");
        int breath = sc.nextInt();
        ac.initialize1(length);
        ac.initialize2(breath);
        System.out.println("Area of the square is -> "+ ac.area());
        System.out.println("Parameter of the square is -> "+ ac.parameter());
    }
}
