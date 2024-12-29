public class Supplier {
    private String id;
    private String name;
    private String contact;

    public Supplier(String id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Supplier[ID=" + id + ", Name=" + name + ", Contact=" + contact + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Supplier supplier = (Supplier) obj;
        return id.equals(supplier.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
