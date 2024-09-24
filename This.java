
class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println(name + " " + "Make a sound");
    }
}

//subclass
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void sound(){
        super.sound();
        System.out.println(name + " " + "Bark");
    }
}
public class This {
    public static void main(String [] args){
        Dog dog = new Dog("Angeer");
        dog.sound();
    }
}
// super is for any variable or things that will be there eternally