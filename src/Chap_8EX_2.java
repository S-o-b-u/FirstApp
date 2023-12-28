import java.util.Scanner;

//Create a class cellphone with methods to print  "ringing...", "Vibrating..." etc.
class cellphone {
    String name;
    public void set (String n){
        name = n;
    }
//    public String getN(){
//        return name;
//    }
    public String call(){
        return "Calling..."+name;
    }
    public String ring(){
        return "Ringing...Just here...";
    }
    public String vibe(){        //optional
        return "Vibrating...";
    }
    public String cut(){
        return "From "+name+"...\n"+"I'll Call You Back Later Little DEV";
    }
}
public class Chap_8EX_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cellphone phone = new cellphone();
        System.out.println("==Welcome To CallBooth==");
        System.out.printf("Name of the person => ");
        String xo = sc.nextLine();
        phone.set(xo);
//        System.out.println(phone.getN());
        System.out.println(phone.call());
        System.out.println(phone.ring());
        System.out.printf("Ring Ring Ring...");
        System.out.printf("Ring Ring...");
        System.out.println("Ring...");
        System.out.println(phone.vibe());//optional
        System.out.println(phone.cut());
    }

}
