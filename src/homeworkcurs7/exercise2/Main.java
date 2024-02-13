package homeworkcurs7.exercise2;

public class Main {
    public static void main(String[] args){
        Person person=new Person();

       person.setBank(new BRD());

        person.withdrawMoney(200);

        System.out.println(person.depositMoney(1500));

        person.withdrawMoney(200);
    }
}
