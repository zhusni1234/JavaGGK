class Animal{
    public void sound(){
        System.out.println("Default");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }
}


class cat extends Animal{
    
    public void meow(){
        System.out.println("meow");
    }
}



public class Casting {
    public static void main(String [] args){
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new cat();
        myAnimal.sound();

        if (myAnimal instanceof Dog){
            Dog myDog = (Dog) myAnimal;
            myDog.bark();
        }
         if (myAnimal instanceof cat){
            cat myCat = (cat) myAnimal;
            myCat.meow();
         }
        
    }
}
