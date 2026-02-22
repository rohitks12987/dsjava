import java.util.*;

// Book class
class Book {
    int id;
    String name;
    int quantity;

    public Book(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}

// Main class
public class LinkedList5 {
    public static void main(String[] args) {

        List<Book> list = new LinkedList<>();

        Book b1 = new Book(101, "Rohit", 8);
        Book b2 = new Book(102, "RajKishore", 6);
        Book b3 = new Book(103, "R Kumar", 5);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.quantity);
        }
    }
}