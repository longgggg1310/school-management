package school_management;

public interface Account {
    int getBalance();

    int debit(int amount);

    int credit(int amount);

}
