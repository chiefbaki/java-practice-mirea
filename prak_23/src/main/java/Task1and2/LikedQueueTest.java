package Task1and2;

import Task1and2.QueueOnLinkedList.Link;
import Task1and2.QueueOnLinkedList.LinkedQueue;

public class LikedQueueTest {
    public static void main(String[] args) {
       LinkedQueue queue = new LinkedQueue();
       queue.enqueue(new Link(22, 33));
       queue.enqueue(new Link(2, 332));
       queue.enqueue(new Link(24, 51));
       queue.enqueue(new Link(5, 77));
       queue.displayList();
        System.out.println("First element: " + queue.element());
       while (!queue.isEmpty()){
           System.out.println("Deleted: "+queue.dequeue().toString());
       }
       queue.displayList();

    }
}
