import java.lang.*;

public class testAuthor
{
    public static void main(String[] args) {
        Author a1 = new Author("John", "John@author.ru", 'M');
        Author a2 = new Author("George", "George@author.ru", 'M');
        a2.setEmail("George@author.ru");
        System.out.println(a1);
        System.out.println(a2);
    }
}