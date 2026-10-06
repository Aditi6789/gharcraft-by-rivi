import java.util.Scanner;

public class GharCraftApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the GharCraft");
        System.out.println("made with love");

        System.out.print("Enter the product id: ");
        int productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter the discount: ");
        int discount = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the type of product : ");
        String type = sc.nextLine();

        System.out.print("Enter the price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        sc.close();

        Product p1 = new Product(productId, productName, discount, type, price);
        System.out.println("\n--- Product Added ---");
        System.out.println("ID: " + p1.getProductId());
        System.out.println("Name: " + p1.getProductName());
        System.out.println("Type: " + p1.getProductType());
        System.out.println("Price: " + p1.getProductPrice());
        System.out.println("Discount: " + p1.getDiscount() + "%");
    }
}
