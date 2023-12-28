/* Create a class Employee with following properties and methods -->
     -> Salary (property)(int) *
     -> getSalary (method returning int) *
     -> name (property)(string) *
     -> getName (method returning string)
     -> setName (method changing name)
*/
class employee {
    float salary;
    String name;
    public float getsalary(){
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}
public class Chap_8EX_1 {
    public static void main(String[] args) {
        employee a1 = new employee();
        a1.salary = 4.5f;
        a1.setName("Souvik Rahut");
        System.out.println("Name -> "+a1.getName());
        System.out.println("Salary -> "+ a1.getsalary());
        a1.salary = 5.2f;
        a1.setName("Dhrubyojyoti Sarkar");
        System.out.println("Name -> "+a1.getName());
        System.out.println("Salary -> "+ a1.getsalary());
    }
}
