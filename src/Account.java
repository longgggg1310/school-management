package src;

public interface Account {
    int getBalance();

    int debit(int amount);

    int credit(int amount);

}
