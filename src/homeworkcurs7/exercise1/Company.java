package homeworkcurs7.exercise1;

public class Company {
    private Advertisement advertiser;
    private int numberOfPosts = 2;

    public void setTheAdvertiser(Advertisement advertiser) {
        this.advertiser = advertiser;
    }

    public void printMyServices() {
        for (int x = 0; x < numberOfPosts; x++) {
            System.out.println(advertiser.printServices());
        }
    }

    public void deleteMyServices() {
        for (int x = 0; x < numberOfPosts; x++) {
            System.out.println(advertiser.deleteServices());
        }
    }

    public boolean payTheAdvertiser() {
        return advertiser.pay(8);
    }
}
