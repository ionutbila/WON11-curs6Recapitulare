package homeworkcurs7.exercise2;

public class BRD implements Bank {
    private double availableBalance = 0;

    @Override
    public boolean withdraw(double money) {
        if (money <= availableBalance) {
            availableBalance -= money;
            System.out.println("Successful transaction! Remaining balance " + availableBalance);
            return true;
        } else {
            System.out.println("Sorry! The available balance is only: " + availableBalance);
            return false;
        }
    }

    @Override
    public boolean deposit(double money) {
        availableBalance += money;
        return true;
    }
}
