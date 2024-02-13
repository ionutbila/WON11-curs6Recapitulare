package homeworkcurs7.exercise1;

public class Email implements Advertisement {
    private String information = "Professional services";
    private String printedMessage = "";
    private double amountToPay=0;
    private double priceForPublishing=10;
    private int numberOfPosts=0;

    @Override
    public String printServices() {
        amountToPay+=priceForPublishing;
        numberOfPosts++;
        return printedMessage = information;
    }

    @Override
    public String deleteServices() {
        numberOfPosts--;
        printedMessage = "";

        return "The posts were deleted";
    }

    @Override
    public boolean pay(double money) {
        if(money<=amountToPay&&money>0){
            amountToPay-=money;
            System.out.println("Email company was payed!");
            return true;
        }
        System.out.println("There was no payment made!");
        return false;
    }

    public int getNumberOfPosts(){
        return numberOfPosts;
    }
}
