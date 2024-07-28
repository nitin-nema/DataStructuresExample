package trainingsixjune;

//Base class Employee
class Employee {
 private String name;
 private int employeeId;

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

//Derived class Engineer
class Engineer extends Employee {
 private String specialization;

 public Engineer(String name, int employeeId, String specialization) {
     super(name, employeeId);
     this.specialization = specialization;
 }

 public String getSpecialization() {
     return specialization;
 }

 public void designSystem() {
     System.out.println(getName() + " is designing a " + specialization + " system.");
 }
}

//Derived class Accountant
class Accountant extends Employee {
 private String certification;

 public Accountant(String name, int employeeId, String certification) {
     super(name, employeeId);
     this.certification = certification;
 }

 public String getCertification() {
     return certification;
 }

 public void prepareFinancialReport() {
     System.out.println(getName() + " is preparing a financial report.");
 }
}

public class HierarchicalInheritanceExample {
 public static void main(String[] args) {
     Engineer engineer = new Engineer("Charlie", 103, "software");
     Accountant accountant = new Accountant("David", 104, "CPA");

     engineer.work();
     engineer.designSystem();

     accountant.work();
     accountant.prepareFinancialReport();
 }
}
