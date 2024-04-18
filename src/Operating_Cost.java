package src;

public class Operating_Cost implements Payable {
    private String name;
    private String code;
    private Double quantity;
    private Double price;
    private Account account;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Operating_Cost(String name, String code, Double quantity, Double price) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
        account = new MyAccount(code, 0);
    }

    @Override
    public double getCost() {
        return quantity * price;
    }

}
