public class Main {
    public static void main(String[] args) {
        Supplier s1 = new Supplier("S01", "Apple", "apple.com");
        Supplier s2 = new Supplier("S02", "Samsung", "samsung.com");

        Product p1 = new Product("L01", "Macbook Air M1", 10, 1000.0, s1);
        Product p2 = new Product("P01", "iPhone 15 Pro Max", 20, 1200.0, s1);
        Product p3 = new Product("T01", "iPad Pro M1", 15, 800.0, s1);
        Product p4 = new Product("P02", "Samsung S21 Ultra", 12, 950.0, s2);

        Inventory inventory = new Inventory(10);
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.addProduct(p4);

        inventory.displayInventory();

        inventory.checkStock("L01");
        inventory.checkStock("L03");

        inventory.updateStock("L01", 12);
        inventory.checkStock("L01");

        inventory.compareProductPrices("P01", "L01");
        inventory.compareProductPrices("P02", "T01");
    }
}
