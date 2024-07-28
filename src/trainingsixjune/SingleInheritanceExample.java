package trainingsixjune;

//Base class Employee
class Employee {
 private String name;
 private int employeeId;

 //constuctor
 public Employee(String name, int employeeId) {
     this.name = name;
     this.employeeId = employeeId;
 }

 public String getName() {
     return name;
 }

 public int getEmployeeId() {
     return employeeId;
 }

 public void work() {
     System.out.println(name + " is working.");
 }
}

//Derived class Manager
class Manager extends Employee {
 private String department;

 public Manager(String name, int employeeId, String department) {
     super(name, employeeId);
     this.department = department;
 }

 public String getDepartment() {
     return department;
 }

 public void conductMeeting() {
     System.out.println(getName() + " is conducting a meeting in " + department + " department.");
 }
}

public class SingleInheritanceExample {
 public static void main(String[] args) {
     Manager manager = new Manager("Alice", 101, "Sales");
     manager.work();
     manager.conductMeeting();
 }
}

