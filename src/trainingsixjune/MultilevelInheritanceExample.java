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

//Derived class SeniorManager
class SeniorManager extends Manager {
 private int teamSize;

 public SeniorManager(String name, int employeeId, String department, int teamSize) {
     super(name, employeeId, department);
     this.teamSize = teamSize;
 }

 public int getTeamSize() {
     return teamSize;
 }

 public void evaluateTeam() {
     System.out.println(getName() + " is evaluating a team of " + teamSize + " members.");
 }
}

public class MultilevelInheritanceExample {
 public static void main(String[] args) {
     SeniorManager seniorManager = new SeniorManager("Bob", 102, "IT", 10);
     seniorManager.work();
     seniorManager.conductMeeting();
     seniorManager.evaluateTeam();
 }
}

