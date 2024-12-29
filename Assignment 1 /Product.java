public class Product {
    private String id;
    private String name;
    private int qty;
    private double price;
    private Supplier supplier;

    public Product(String id, String name, int qty, double price, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.supplier = supplier;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + qty);
        System.out.println("Price: " + price);
        supplier.displayInfo();
    }

    public double getTotalValue() {
        return qty * price;
    }

    public void comparePrice(Product otherProduct) {
        if (price > otherProduct.price) {
            System.out.println(name + " is more expensive than " + otherProduct.name);
        } else if (price < otherProduct.price) {
            System.out.println(name + " is cheaper than " + otherProduct.name);
        } else {
            System.out.println(name + " and " + otherProduct.name + " have the same price");
        }
    }
}
