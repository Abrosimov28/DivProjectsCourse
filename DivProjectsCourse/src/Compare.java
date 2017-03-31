import java.util.*;

public class Compare {

   public static void main(String args[]) {

      List<Person> list = new ArrayList<Person>();

      list.add(new Person("Bob", 30));
      list.add(new Person("Alex", 20));
      list.add(new Person("Blex", 10));
      list.add(new Person("Clex", 40));
      list.add(new Person("Dlex", 10));
      
      Collections.sort(list);  
      for(Person a: list)   // printing the sorted list of names
         System.out.print(a.getDogName() + ", ");


      Collections.sort(list, new Person());
      System.out.println(" ");     
      for(Person a: list)   // printing the sorted list of ages
         System.out.print(a.getDogName() +"  : "+ a.getDogAge() + ", ");
   }
}

class Person implements Comparator<Person>, Comparable<Person> {
   private String name;
   private int age;
   Person() {
   }

   Person(String n, int a) {
      name = n;
      age = a;
   }

   public String getDogName() {
      return name;
   }

   public int getDogAge() {
      return age;
   }

   // Overriding the compareTo method
   public int compareTo(Person d) {
      return (this.name).compareTo(d.name);
   }

   // Overriding the compare method to sort the age 
   public int compare(Person d, Person d1) {
      return d.age - d1.age;
   }
}
