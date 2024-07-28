package trainingsixjune;

//Technical interface
interface Technical {
 void provideTechnicalAdvice();  //Abstract method
}

//Financial interface
interface Financial {
 void provideFinancialAdvice();
}

//Consultant class implementing both interfaces
class Consultant implements Technical, Financial {
 private String name;

 public Consultant(String name) {
     this.name = name;
 }

 @Override
 public void provideTechnicalAdvice() {
     System.out.println(name + " is providing technical advice.");
 }

 @Override
 public void provideFinancialAdvice() {
     System.out.println(name + " is providing financial advice.");
 }
}

public class MultipleInheritanceExample {
 public static void main(String[] args) {
     Consultant consultant = new Consultant("Eve");
     consultant.provideTechnicalAdvice();
     consultant.provideFinancialAdvice();
 }
}
