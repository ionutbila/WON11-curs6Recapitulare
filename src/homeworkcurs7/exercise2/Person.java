package homeworkcurs7.exercise2;

public class Person {
    private Bank bank;

    public void setBank(Bank bank) {

        this.bank = bank;
    }

    public boolean withdrawMoney(double money) {

        return bank.withdraw(money);
    }

    public boolean depositMoney(double money) {

        return bank.deposit(money);
    }


}
