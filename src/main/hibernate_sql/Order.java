import java.time.LocalDate;

public class Order {
    private int user_id;
    private int product_id;
    private int quantity;
    private String status;
    private LocalDate dateOfOrder;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user_id=" + user_id +
                ", product_id=" + product_id +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                ", dateOfOrder=" + dateOfOrder +
                '}';
    }
}
