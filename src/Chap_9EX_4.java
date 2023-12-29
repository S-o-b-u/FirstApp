//Overload a constructor used to initialize a rectangle of length 4 and 5 for using custom parameters
class rectangleX{
    private float length;
    private float breath;
    public rectangleX(float a, float b){
        length = a;
        breath = b;
    }
    public float getLength(){
        return length;
    }
    public float getBreath(){
        return breath;
    }

}
public class Chap_9EX_4 {
    public static void main(String[] args) {
        rectangleX me = new rectangleX(4.5f, 5);
        System.out.println("The length is => "+me.getLength());
        System.out.println("The breath is => "+me.getBreath());

    }
}
