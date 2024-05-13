package patternProject;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Employee2 {
    public static void main(String args[]) {
        LinkedList<Employee> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the Employee Name");
            String name = sc.next();
            System.out.println("Enter the Employee id");
            int id = sc.nextInt();
            System.out.println("Enter the Employee salary");
            double salary = sc.nextDouble();
            ll.add(new Employee(id, name, salary));
            System.out.println("Do you want to enter Employee Details");
            if (!sc.next().equalsIgnoreCase("yes"))
                break;
        }

       
        Collections.sort(ll, Comparator.comparingDouble(Employee::getsalary));

        
        for (Employee emp : ll) {
            System.out.println(emp);
        }
    }
}
