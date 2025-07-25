package lesson10.generics;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Account batman = new Account(2312312312312L, "Batman", new BigDecimal(10000000));
        System.out.println(batman);
        batman.deposit(new BigDecimal(12321));
        batman.withdraw(new BigDecimal(1232123121));
        System.out.println(batman);

        AnotherAccount anotherAccount = new AnotherAccount("ASD12312312", "Superman", new BigDecimal(100));
        System.out.println(anotherAccount);

        Money<BigDecimal> money = new Money<>() {
            BigDecimal amount;

            @Override
            public BigDecimal getAmount() {
                return amount;
            }

            @Override
            public void deposit(BigDecimal amount) {
                this.amount = this.amount.add(amount);
            }

            @Override
            public void withdraw(BigDecimal amount) {
                this.amount = this.amount.subtract(amount);
            }
        };

        GenericAccount<Long, Money<BigDecimal>> newBatman =
                new GenericAccount<>(2312312312311L, "new Batman", money);
        var newBatman2 = new GenericAccount<>(231231231L, "new Batman", money);
        Long id1 = newBatman2.getId();
//        GenericAccount<String, Integer>  v = new GenericAccount<>("231231231L", "new Batman",21312312);
//        String id = v.getId();
//
//        GenericAccount<String, Integer>  a = new GenericAccount<>("231231231L", "new Batman",21312312);
//
//        GenericAccount<String, String>  b = new GenericAccount<>("231231231L", "new Batman","asdas21312312");
    }
}
