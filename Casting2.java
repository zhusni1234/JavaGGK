class Animal{
    public void sound(){
        System.out.println("Default");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("barks");
    }
}


class cat extends Animal{
    
    public void meow(){
        System.out.println("meow");
    }
}



public class Casting2 {
    public static void main(String [] args){
        Animal myAnimal = new Dog();
        myAnimal.sound();
        if (myAnimal instanceof Dog){
            Dog myDog = (Dog) myAnimal;
            myDog.bark();
        }

        myAnimal = new cat();
       

       
         if (myAnimal instanceof cat){
            cat myCat = (cat) myAnimal;
            myCat.meow();
         }
        
    }
}
