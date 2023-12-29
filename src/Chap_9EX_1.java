//Create a class cylinder and use getters and setters to set its radius and height.
class cylinder{
    private float radius;
    private float height;
    public void setRadius(float r) {
        this.radius = r;
    }
    public void setHeight(float h){
        this.height = h;
    }
    public float getHeight(){
        return height;
    }
    public float getRadius(){
        return radius;
    }
}
public class Chap_9EX_1 {
    public static void main(String[] args) {
        cylinder ac = new cylinder();
        ac.setRadius(5);
        ac.setHeight(4.5f);
        System.out.println(ac.getRadius());
        System.out.println(ac.getHeight());
    }
}
