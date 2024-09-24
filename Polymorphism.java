//Super class
class Animal{
    public void sound(){
        System.out.println("Hop Hop");
    }
}
//subclass1
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Bark");
    }

}
//subclass 2
class cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}
//subclass 3
class cow extends Animal{
    @Override
    public void sound(){
        System.out.println("Moo");
    }
}
public class Polymorphism {
    public static void main(String [] args){
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new cat();
        myAnimal.sound();

        myAnimal = new cow();
        myAnimal.sound();

    }   
}
