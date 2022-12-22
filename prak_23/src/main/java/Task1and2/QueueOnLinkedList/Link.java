package Task1and2.QueueOnLinkedList;

public class Link {
    public int iDate; // ключ
    public double dData; // Данные
    public Link next; // Следующий элемент в списке
    public Link(int id, double dd){
        iDate = id;
        dData = dd;
    }

    @Override
    public String toString() {
        return "{" + iDate + ", " + dData + "} ";
    }

}
