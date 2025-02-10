package test.java.excersises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import test.java.entity.Department;
import test.java.entity.Employee;

public class Main {

  public static void main(String[] args) {


    List<Department> departments = Data.departments;
    List<Employee> employees = Data.employee;

   // Find the names of all employees working in a specific department (e.g., "IT").
    List<String> result = employees.stream()
        .filter(emp -> departments.stream()
            .filter(dept -> dept.getName().equals("IT"))
            .anyMatch(dept -> dept.getId() == emp.getDepartmentId())
        )
        .map(emp -> emp.getName())
        .collect(Collectors.toList());

    System.out.println(result);
  }

}
