package Task1and2;

import Task1and2.QueueOnArray.ArrayQueue;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.display();
        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(100);
        queue.enqueue(13);
        queue.enqueue(42);
        queue.enqueue(21);
        queue.enqueue(11);
        queue.enqueue(0);
        queue.display();
        System.out.println("Первый элемент в очереде: " + queue.element());
        System.out.println("Очередь пустая? " + queue.isEmpty());
        System.out.println("В очереде нет места? " + queue.isFull());
        queue.clear();
        queue.display();
    }
}
