package Task1and2.QueueOnLinkedList;

public class LinkList {
    protected Link first;
    public LinkList(){
        first = null;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void insertFirst(int id, double dd){
        Link nextLink = new Link(id, dd);
        nextLink.next = first;
        first = nextLink;
    }
    public Link deleteFirst(){
        Link temp = first; // Сохранение ссылки
        first = first.next; // Удаление: first-->ссылка на второй элемент
        return temp; // Метод возвращает ссылку
    }
    public void displayList(){
        if (!isEmpty()){
            System.out.println("List (first->last): ");
            Link current = first;
            while (current != null){
                System.out.print(current + " ");
                current = current.next;
            }
            System.out.println();
        }
        else System.out.println("List is empty");
    }
}
