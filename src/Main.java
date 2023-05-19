import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Publication pub1 = new Publication(scanner);
        System.out.println(pub1);

        Book book1 = new Book(scanner);
        System.out.println(book1);

        Book book2 = new Book(scanner);
        System.out.println(book2);

        Book book3 = book1.addBook(book2);
        System.out.println(book3);

        scanner.close();
    }
}