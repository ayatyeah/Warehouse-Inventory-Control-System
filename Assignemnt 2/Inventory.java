import java.util.Arrays;
import java.util.Comparator;

public class Inventory {
    private Product[] products;
    private int productCount;

    public Inventory(int capacity) {
        products = new Product[capacity];
        productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        } else {
            System.out.println("Full Inventory");
        }
    }

    public void displayInventory() {
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i]);
        }
    }

    public void filterBySupplier(String supplierName) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getSupplier().getName().equalsIgnoreCase(supplierName)) {
                System.out.println(products[i]);
            }
        }
    }

    public Product searchById(String productId) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId().equals(productId)) {
                return products[i];
            }
        }
        return null;
    }

    public void sortByPrice() {
        Arrays.sort(products, 0, productCount, Comparator.comparingDouble(Product::getPrice));
    }
}