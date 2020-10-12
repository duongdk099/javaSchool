import java.util.*;
public class linkedListDEMO{
  
public static void main(String[] args) {
  LinkedList<String> ll= new LinkedList<>(); // Create
  // Update
  ll.add("Hello");
  ll.add("I'm ");
  ll.add("Barry");

  System.out.println("Read the linked list: \n"+ll);

  // Read
  // Using the Get method and the for loop  
    for (int i = 0; i < ll.size(); i++) {  
      System.out.print(ll.get(i) + " ");  
      }  
      System.out.println();  
    
      // Using the for each loop  
      for (String str : ll)  
        System.out.print(str + " ");  
  
  // Update
  ll.set(0, "What's up!!!");
  System.out.println("\nAfter changing the first element to 'What's up' \n"+ll);

  System.out.println("\nSize of the linkedlist is: "+ll.size());

  ll.remove(0); // Delete
  ll.remove("I'm ");// Delete
  System.out.println("After delete first element and element 'I'm' \n"+ll);
  }
}