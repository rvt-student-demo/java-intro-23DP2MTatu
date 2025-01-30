package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
