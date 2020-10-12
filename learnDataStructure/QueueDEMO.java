// Queue FIFO (First In First Out) the first element that is added to the queue is the first one to be removed. 
// Learn by doing CRUD (Create, Read, Update, Delete)
import java.util.LinkedList;
import java.util.*;
public class QueueDEMO {
    public static void main(String[] args) {
        // C(Create) a Queue with this kind of LinkedList
        //As Queue is an interface, 
        //we use a LinkedList class that implements the Queue interface to create a queue object.
        Queue<String> strQueue = new LinkedList<>();
        
        // U(Update) : Enqueue with methode add, speed : O(1)
        strQueue.add("S");
        strQueue.add("U");
        strQueue.add("P");
        strQueue.add("E");
        strQueue.add("R");
        // R(Read) : Read the Queue
        System.out.println("The queue with just Enqueue methode is: "+ strQueue);   

        System.out.println("Queue FIFO, First In First Out");

        // D(Delete) : Dequeue , speed : O(1)
        strQueue.remove(); // Remove the First Element
        System.out.println("The queue with Delete (Dequeue) is: "+ strQueue);   
        //remove () method =>removes first element from the queue
        System.out.println("Element removed from the queue: "+strQueue.remove());
        //element() => returns head of the queue
        System.out.println("Head of the queue: "+strQueue.element());
        //poll () => removes and returns the head
        System.out.println("Poll():Returned Head of the queue: "+strQueue.poll());
        //returns head of the queue
        System.out.println("peek():Head of the queue: "+strQueue.peek());
        //print the contents of the Queue
        System.out.println("Final Queue:"+strQueue);
    }
}