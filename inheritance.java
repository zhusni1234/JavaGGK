//super class

class Animal{
    public void eat(){
        System.out.println("The animal is eating");
    }
}

//subclass

class Dog extends Animal{
    public void bark(){
        System.out.println("The dork barked");
    }
}

public class inheritance {
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
