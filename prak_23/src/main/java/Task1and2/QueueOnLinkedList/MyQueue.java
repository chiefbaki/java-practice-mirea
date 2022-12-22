package Task1and2.QueueOnLinkedList;

public interface MyQueue{
    //Добавление жлемента в очередь
    void enqueue(Object j);
    //Удаление элемента из очереди
    Object dequeue();
    // Получение первого элемента в очереди
    Object element();
    // Есть ли в очереди элементы
    boolean isEmpty();

}
