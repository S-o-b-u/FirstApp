//Use a constructor in a class cylinder to set its radius and height
class cylinder3 {
    private float radius;
    private float height;
    public cylinder3(){
        radius = 5;
        height = 4.5f;
    }
    public float getHeight(){
        return height;
    }
    public float getRadius(){
        return radius;
    }

}
public class Chap_9EX_3 {
    public static void main(String[] args) {
        cylinder3 me = new cylinder3();
        System.out.println(me.getRadius());
        System.out.println(me.getHeight());
    }
}
