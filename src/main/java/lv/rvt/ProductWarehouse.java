package lv.rvt;

public class ProductWarehouse extends Warehouse {
    
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }
    
    public String getName() {
        return productName;
    }
    
    public String toString() {
        return productName + ": balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }
}
