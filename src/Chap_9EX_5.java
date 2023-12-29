//Create a class sphere and use getters and setters to set its radius.
class sphere{
    private float radius;
    public void setRadius(float r) {
        this.radius = r;
    }
    public float getRadius(){
        return radius;
    }
}
public class Chap_9EX_5 {
        public static void main(String[] args) {
            sphere ac = new sphere();
            ac.setRadius(5);
            System.out.println(ac.getRadius());
        }
    }


