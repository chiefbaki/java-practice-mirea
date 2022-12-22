package Task1and2.QueueOnLinkedList;

public class LinkedQueue extends LinkList implements MyQueue {

    @Override
    public void enqueue(Object j) {
        Link link = (Link) j;
            insertFirst(link.iDate,link.dData);
    }

    @Override
    public Object dequeue() {
        return deleteFirst();
    }

    @Override
    public Object element() {
        return first;
    }
}
