package test.java.entity;

public class Employee {
  int id;
  String name;
  int age;
  double salary;
  int departmentId;
  // Constructor, getters, and toString
  public Employee(int id, String name, int age, double salary, int departmentId) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.departmentId = departmentId;
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public int getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
  }
}
