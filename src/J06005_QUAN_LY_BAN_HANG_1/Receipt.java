package J06005_QUAN_LY_BAN_HANG_1;

public class Receipt {
    private String id;
    private Customer customer;
    private Product product;
    private int quantity;

    public Receipt(int id, Customer customer, Product product, int quantity) {
        this.id = String.format("HD%03d", id);
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return quantity * product.getSalePrice();
    }

    @Override
    public String toString() {
        return id + " " + customer.getName() + " " + customer.getAddress() + " " + product.getName() + " "
                + product.getUnit() + " " + product.getBuyPrice() + " " + product.getSalePrice() + " "
                + quantity + " " + getAmount();
    }
}
