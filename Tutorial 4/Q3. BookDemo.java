import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        String t1 = sc.nextLine();
        System.out.print("Enter author: ");
        String a1 = sc.nextLine();
        System.out.print("Enter price: ");
        double p1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter title: ");
        String t2 = sc.nextLine();
        System.out.print("Enter author: ");
        String a2 = sc.nextLine();
        System.out.print("Enter price: ");
        double p2 = sc.nextDouble();

        Book b1 = new Book(t1, a1, p1);
        Book b2 = new Book(t2, a2, p2);

        System.out.println("\nBook 1:");
        b1.display();

        System.out.println("\nBook 2:");
        b2.display();
    }
}
