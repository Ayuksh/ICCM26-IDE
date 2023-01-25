package Programming;

public class MainApp1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101 , "EMP1 " , 25000);
        Employee emp2 = new Employee(102 , "EMP 2" , 35000);
        Employee emp3 = new Employee(103 , "EMP 3 " , 20000);

        Employee[] arr = {emp1 , emp2 , emp3};

        for (int i =0 ; i< arr.length ; i++)
            arr[i].displayInfo();
    }
}
