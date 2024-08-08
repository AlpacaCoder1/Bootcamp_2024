public class Person {
      int age = 14;
   public void printAge() {
      System.out.println("Age: "+ age);
   }
   public void ageOlder() {
      age++;
      System.out.println("New Age: " + age);
   }
   public void ageYounger() {
      age--;
      System.out.println("New Age: " + age);
   }
    
}
