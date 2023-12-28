import java.util.Scanner;

//Create a class square with a method to initialize its side, calculating area, parameter etc.
class Square {
    int side;
    public int initialize(int n){
        side = n;
        return 0;
    }
    public int area(){
        return (side*side);
    }
    public int parameter(){
        return 4*side;
    }
}
public class Chap_8EX_3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Square ac = new Square();
        System.out.print("Enter A side of the square => ");
        int side = sc.nextInt();
        ac.initialize(side);
        System.out.println("Area of the square is -> "+ ac.area());
        System.out.println("Parameter of the square is -> "+ ac.parameter());
    }
}
