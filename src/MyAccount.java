package package1;

public class MyAccount implements Account {

    private int balance = 0;
    private String id;

    MyAccount(String id, int balance) {
        this.balance = balance;
        this.id = id;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public int debit(int amount) {
        balance -= amount;
        return balance;
    }

    @Override
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
