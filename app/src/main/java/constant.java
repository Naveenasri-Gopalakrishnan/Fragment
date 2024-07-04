import com.example.fragment.Employee;

import java.util.ArrayList;
public class constant {
    public static ArrayList<Employee> getEmployeeData()
    {
        ArrayList<Employee> employeeList
                = new ArrayList<Employee>();
        Employee emp1 = new Employee("Chinmay ",
                "chinmay@gmail.com");
        employeeList.add(emp1);
        Employee emp2
                = new Employee("Ram", "ram@gmail.com");
        employeeList.add(emp2);
        Employee emp3 = new Employee("Neha",
                "neha@gmail.com");
        employeeList.add(emp3);
        Employee emp4 = new Employee("Hari",
                "hari@gmail.com");
        employeeList.add(emp4);
        Employee emp5 = new Employee(
                "Abhi", "abhi@gmail.com");
        employeeList.add(emp5);
        Employee emp6 = new Employee("Siddhu",
                "siddhu@gmail.com");
        employeeList.add(emp6);
        Employee emp7 = new Employee("Akil",
                "akil@gmail.com");
        employeeList.add(emp7);
        Employee emp8 = new Employee("Sachin",
                "sachin@gmail.com");
        employeeList.add(emp8);
        Employee emp9 = new Employee("Amir",
                "amir@gmail.com");
        employeeList.add(emp9);
        Employee emp10 = new Employee("Rahul",
                "rahul@gmail.com");
        employeeList.add(emp10);

        return employeeList;
    }
}

