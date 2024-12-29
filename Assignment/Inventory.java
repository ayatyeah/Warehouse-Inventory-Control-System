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
            products[i].displayInfo();
            System.out.println();
        }
    }

    public void checkStock(String productId) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId().equals(productId)) {
                System.out.println("Product " + productId + " is available with quantity: " + products[i].getQty());
                return;
            }
        }
        System.out.println("Product " + productId + " not found.");
    }

    public void updateStock(String productId, int newQty) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId().equals(productId)) {
                products[i].setQty(newQty);
                System.out.println("Quantity of " + productId + " updated to " + newQty);
                return;
            }
        }
        System.out.println("Product " + productId + " not found.");
    }

    public void compareProductPrices(String productId1, String productId2) {
        Product product1 = null;
        Product product2 = null;

        for (int i = 0; i < productCount; i++) {
            if (products[i].getId().equals(productId1)) {
                product1 = products[i];
            }
            if (products[i].getId().equals(productId2)) {
                product2 = products[i];
            }
        }

        if (product1 == null || product2 == null) {
            System.out.println("One or both products not found.");
            return;
        }

        if (product1.getPrice() > product2.getPrice()) {
            System.out.println("Product " + product1.getName() + " is more expensive than " + product2.getName() + ".");
        } else if (product1.getPrice() < product2.getPrice()) {
            System.out.println("Product " + product1.getName() + " is cheaper than " + product2.getName() + ".");
        } else {
            System.out.println("Both products " + product1.getName() + " and " + product2.getName() + " have the same price.");
        }
    }
}
