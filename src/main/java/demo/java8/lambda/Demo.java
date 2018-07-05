package demo.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Comparator<Employee> sortByName = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };
        
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(500, "First", 150000));
        list.add(new Employee(504, "Second", 120000));
        list.add(new Employee(503, "Third", 100000));
        list.add(new Employee(730, "Forth", 45000));
        list.forEach(System.out::println);
        
        Comparator<Employee> sortByNameWithLambda = 
                (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
        Collections.sort(list, sortByNameWithLambda);
        list.forEach(System.out::println);
    }
}
class Employee {
    private int id;
    private String name;
    private double salary;
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
