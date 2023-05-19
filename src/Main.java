import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Publication pub1 = new Publication(scanner);
        System.out.println(pub1);

        Book book1 = new Book(scanner);
        System.out.println(book1);

        scanner.close();
    }
}