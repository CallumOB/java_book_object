import java.util.InputMismatchException;
import java.util.Scanner;

public class Book extends Publication {
    private int pages;
    
    public Book(String name, float price, int pages) {
        super(name, price);
        this.pages = pages;
    }

    public Book(Scanner scanner) {
        super(scanner);
        boolean valid_input = false;

        while (!valid_input) {
            try {
                System.out.println("Please enter the number of pages in the book.\t");
                this.pages = scanner.nextInt();
                valid_input = true;
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid number. Please try again.");
                scanner.nextLine();
            }
        }

        scanner.nextLine();
    }

    public Book addBook(Book other) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the title of the new book.");
        String newTitle = scanner.nextLine();
        float newPrice = this.getPrice() + other.getPrice();
        int newPages = this.getPages() + other.getPages();

        scanner.close();

        return new Book(newTitle, newPrice, newPages);
    }

    public String toString(){
        return super.toString() + " Pages: " + pages;

    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
}