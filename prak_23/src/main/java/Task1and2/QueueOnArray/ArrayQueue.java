package Task1and2.QueueOnArray;

public class ArrayQueue {
    private int maxSize;
    private Object[] queArray;
    private int front;
    private int rear;
    private int nItems;
    public ArrayQueue(int s){
        maxSize = s;
        queArray = new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    //Вставка элемента в очередь
    public void enqueue(long j){
        if(rear == maxSize-1)//циклический перенос
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }
    //Удаление элемента в конце очереди
    public Object dequeue(){
        Object temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }
    // Чтение элемента в начале очереди
    public Object element() {
        return queArray[front];
    }
    public boolean isEmpty(){
        return nItems == 0;
    }
    public boolean isFull(){
        return nItems == maxSize;
    }
    public int size(){
       return nItems;
    }
    //Удаление всей очереди
    public void clear(){
        while (size() > 0)
            dequeue();
    }
    //Вывод
    public void display(){
        int i;
        if(isEmpty())
            System.out.println("Queue is empty");
        else {
        for (i = front; i <= rear; i++)
            System.out.print(queArray[i] + " ");
        System.out.println();
        }

    }
}
