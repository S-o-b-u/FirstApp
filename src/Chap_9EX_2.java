//Use Class to calculate surface area and volume of the cylinder
class cylinder2{
    private float radius;
    private float height;
    public void setRadius(float r) {
        this.radius = r;
    }
    public void setHeight(float h){
        this.height = h;
    }
    public float getSurfaceArea(){
        return (2*3.14f*radius*height)+(2*3.14f*radius*radius);
    }
    public float getVolume(){
        return 3.14f*radius*radius*height;
    }
}
public class Chap_9EX_2 {
    public static void main(String[] args) {
        cylinder2 ac = new cylinder2();
        ac.setRadius(5);
        ac.setHeight(4.5f);
        System.out.println(ac.getSurfaceArea());
        System.out.println(ac.getVolume());
    }
}
