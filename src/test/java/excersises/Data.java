package test.java.excersises;

import java.util.Arrays;
import java.util.List;
import test.java.entity.Department;
import test.java.entity.Employee;

public class Data {
  static  List<Employee> employee= Arrays
      .asList(
          new Employee(1, "Alice", 30, 70000, 1),
          new Employee(2, "Bob", 28, 80000, 2),
          new Employee(3, "Charlie", 35, 120000, 1),
          new Employee(4, "David", 40, 90000, 3),
          new Employee(1, "Alice", 30, 70000, 1),
          new Employee(22, "Bob", 28, 80000, 2),
          new Employee(33, "marshal", 35, 120000, 1),
          new Employee(42, "David", 40, 90000, 3),
          new Employee(1, "Alice", 30, 70000, 1),
          new Employee(21, "king", 28, 80000, 2),
          new Employee(34, "aurther", 35, 120000, 1),
          new Employee(46, "martin", 40, 90000, 3)
      );
  static  List<Department>departments=Arrays.asList(
      new Department(1, "IT"),
      new Department(2, "HR"),
      new Department(3, "Finance")
  );
}
