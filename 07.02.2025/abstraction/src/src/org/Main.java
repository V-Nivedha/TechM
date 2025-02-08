package src.org;
abstract class Animal {

    public abstract void makeSound();

}


class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The dog is barking!");

    }

}

public class Main {
    public static void main(String[] args) {

        Animal myDog = new Dog();
        Dog mydog2 = new Dog();
        mydog2.makeSound();
        myDog.makeSound();
    }
}
