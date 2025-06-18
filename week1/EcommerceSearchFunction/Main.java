

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Personal Care"),
            new Product(103, "Notebook", "Stationery"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Pen", "Stationery")
        };

        String searchName = "Notebook";

        // Linear Search
        Product linearResult = LinearSearch.search(products, searchName);
        if (linearResult != null) {
            System.out.println("Linear Search: Product found - " + linearResult.productName);
        } else {
            System.out.println("Linear Search: Product not found");
        }

        // Binary Search
        Product binaryResult = BinarySearch.search(products, searchName);
        if (binaryResult != null) {
            System.out.println("Binary Search: Product found - " + binaryResult.productName);
        } else {
            System.out.println("Binary Search: Product not found");
        }
    }
}
