package lesson10.generics;

import java.math.BigDecimal;

public class Account {

    private Long id;
    private String owner;
    private BigDecimal amount;

    public Account(Long id, String owner, BigDecimal amount) {
        this.id = id;
        this.owner = owner;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void deposit(BigDecimal amount) {
        this.amount = this.amount.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", amount=" + amount +
                '}';
    }
}
