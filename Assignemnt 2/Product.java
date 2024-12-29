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

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "Product[ID=" + id + ", Name=" + name + ", Qty=" + qty + ", Price=" + price + ", Supplier=" + supplier + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}