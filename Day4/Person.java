package Day4;
public class Person {
      int age = 14;
      String name = "Rushi";

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

   public void setAge(int newAge) {
      age = newAge;
   }

   public void setAgeAndName(int newAge, String newName) {
      age = newAge;
      name = newName;
   }
   public int getter() {
      return age;
   }
   public void printName() {
      System.out.println("Name: " + name);
   }
    
}
