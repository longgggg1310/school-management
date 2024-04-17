package src;

public class Student implements Account {
    protected String name;
    private String code;
    private int school_creadits = 0;
    private double price;
    private Account account;

    Student(String name, String code, int school_creadits, Account account) {
        this.name = name;
        this.code = code;
        this.school_creadits = school_creadits;
        account = new MyAccount(code, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double get_tuition(int school_creadits, double price) {
        return school_creadits * price;
    }

    @Override
    public int getBalance() {
        return account.getBalance();
    }

    @Override
    public int debit(int amount) {
        return account.debit(amount);
    }

    @Override
    public int credit(int amount) {
        return account.credit(amount);
    }

}
