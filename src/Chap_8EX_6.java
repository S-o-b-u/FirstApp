import java.util.Scanner;

//Create a class circle with a method to initialize its radius, calculating area, perimeter etc.
class circle{
    float radius;
    public void initialize (float y){
        radius = y;
    }
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2 * 3.14f * radius;
    }

}
public class Chap_8EX_6 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        circle ac = new circle();
        System.out.println("Choose 1 for-->Radius");
        System.out.println("Choose 2 for-->Diameter");
        int ch = sc.nextInt();
        if (ch==1){
            System.out.print("Enter RADIUS of the circle => ");
            float radius = sc.nextFloat();
            ac.initialize(radius);
        }
        else if (ch==2){
            System.out.print("Enter DIAMETER of the circle => ");
            float diameter = sc.nextFloat();
            float radius = (diameter/2);
            ac.initialize(radius);
        }
        else {
            System.out.printf("Invalid Input");
        }
        System.out.println("Area of the circle is -> "+ ac.area());
        System.out.println("Perimeter of the circle is -> "+ ac.perimeter());
    }
}
