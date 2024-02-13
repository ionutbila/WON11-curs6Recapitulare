package homeworkcurs7.exercise3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.walk());
        System.out.println(cat.talk());
        System.out.println(cat.eat());

        Dog dog = new Dog();
        System.out.println(dog.walk());
        System.out.println(dog.talk());
        System.out.println(dog.eat());

        Mouse mouse = new Mouse();
        System.out.println(mouse.walk());
        System.out.println(mouse.talk());
        System.out.println(mouse.eat());

        Chicken chicken = new Chicken();
        System.out.println(chicken.walk());
        System.out.println(chicken.talk());
        System.out.println(chicken.eat());

        Duck duck = new Duck();
        System.out.println(duck.walk());
        System.out.println(duck.talk());
        System.out.println(duck.eat());
    }
}
