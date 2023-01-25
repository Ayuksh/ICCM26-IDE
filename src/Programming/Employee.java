package Programming;

public class Employee {
    int id ;
    String name ;
    double sal ;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void displayInfo()
    {
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
        System.out.println("SALARY : "+sal);
        System.out.println("=======================");
    }
}
