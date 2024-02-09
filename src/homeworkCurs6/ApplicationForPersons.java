package homeworkCurs6;

public class ApplicationForPersons {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());

        System.out.println(person1.getAge());
        System.out.println(person2.getAge());
        System.out.println(person3.getAge());

        System.out.println(person1.isMarried());
        System.out.println(person2.isMarried());
        System.out.println(person3.isMarried());


    }
}
