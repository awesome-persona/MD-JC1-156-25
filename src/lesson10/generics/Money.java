package lesson10.generics;

public interface Money<K> {

    K getAmount();

    void deposit(K amount);

    void withdraw(K amount);
}
