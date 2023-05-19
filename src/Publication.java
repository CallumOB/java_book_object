import java.util.InputMismatchException;
import java.util.Scanner;

public class Publication {
    private String name;
    private float price;

    public Publication(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Publication(Scanner scanner) {
        boolean valid_input = false;

        System.out.println("Please enter the name of the publication.\t");
        this.name = scanner.nextLine();

        while (!valid_input) {
            try {
                System.out.println("Please enter the price of the publication.\t");
                this.price = scanner.nextFloat();
                valid_input = true;
            } catch (InputMismatchException e) {
                System.out.println("That's not a valid price, try again.");
                scanner.nextLine();
            }
        }
    }

    public String toString() {
        return "Title: " + name + " Price: €" + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
