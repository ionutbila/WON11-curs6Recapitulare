package homeworkcurs7.exercise1;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.setTheAdvertiser(new Print());

        company.printMyServices();

        company.deleteMyServices();

        System.out.println(company.payTheAdvertiser());

    }
}

