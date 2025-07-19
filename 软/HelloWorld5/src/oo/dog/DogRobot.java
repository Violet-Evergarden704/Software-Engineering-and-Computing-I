package oo.dog;
//, Movable
public class DogRobot extends Robot implements Pet,Movable {

    public void play() {
        System.out.println("oo.dog.DogRobot play");
    }

    @Override
    public void move() {
        System.out.println("oo.dog.DogRobot move");
    }

    public static void main(String[] args){
        Pet[] pets = new Pet[2];

        pets[0] = new Dog2();
        pets[1] = new DogRobot();

        for(Pet p : pets)
            p.play();
    }
}
