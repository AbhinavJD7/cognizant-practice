import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

class ProductSearch {
    public static List<Product> searchProducts(List<Product> products, String keyword) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        List<Product> products = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name for product " + i + ": ");
            String name = sc.nextLine();

            System.out.print("Enter price for product " + i + ": ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume newline

            products.add(new Product(name, price));
        }

        System.out.print("Enter search keyword: ");
        String searchKeyword = sc.nextLine();

        List<Product> result = ProductSearch.searchProducts(products, searchKeyword);

        if (result.isEmpty()) {
            System.out.println("No products found for '" + searchKeyword + "'");
        } else {
            System.out.println("Search results for '" + searchKeyword + "':");
            for (Product p : result) {
                System.out.println(p.getName() + " - Rs. " + p.getPrice());
            }
        }
    }
}

