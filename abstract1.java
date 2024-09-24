abstract class Animal{
    public abstract void sound();

    public void sleep(){
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("Barking");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();
        dog.sound();
    }
}