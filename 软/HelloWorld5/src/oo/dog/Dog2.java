package oo.dog;

public class Dog2 extends Animal implements Pet {


    public void sleep() {
        System.out.println("oo.dog.Dog sleep");
    }

    public static void main(String[] args){
        Animal animal = new Dog2();
        animal.eat();
        animal.sleep();

        Pet pet = (Pet) animal;
        pet.play();
    }

    public void play(){
        System.out.println("oo.dog.Dog play");
    }
}
