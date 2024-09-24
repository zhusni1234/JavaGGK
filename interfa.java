interface Animal{
    void sound();

}

interface Playball{
    void play();
}

class Dog implements Animal,Playball{
    @Override
    public void sound(){
        System.out.println("Bark");
    }
    @Override
    public void play(){
        System.out.println("Dog is playing");
    }
}


public class interfa {
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.sound();
        dog.play();

    }
}
