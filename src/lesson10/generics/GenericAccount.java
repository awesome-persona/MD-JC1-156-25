package lesson10.generics;

public class GenericAccount<T extends Object, K extends Money> {


//    private Object id;
//    private String owner;
//    private Object amount;

    private T id;
    private String owner;
    private K amount;

    public GenericAccount(T id, String owner, K amount) {
        this.id = id;
        this.owner = owner;
        this.amount = amount;
    }

    public T getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public K getAmount() {
        return amount;
    }

    public void deposit(K amount) {
        this.amount.deposit(amount);
    }

    public void withdraw(K amount) {
        this.amount.withdraw(amount);
    }
}
