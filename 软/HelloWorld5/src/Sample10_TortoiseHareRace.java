public class Sample10_TortoiseHareRace {
    public void game(int hareSpeed, int hareSleepDuration, int tortoiseSpeed, int distance){
        //create hare and tortoise object
        //add some codes here
        Hare h = new Hare(hareSpeed,hareSleepDuration);
        Tortoise t = new Tortoise(tortoiseSpeed);

        //calculate the hare and tortoise's race time
        //add some codes here
        double hareTime = h.race(distance);
        double tortoiseTime = t.race(distance);

        System.out.println(hareTime+" "+tortoiseTime);

        //compare the time and judge who wins the game
        //add some codes here
        if (hareTime<tortoiseTime)
            h.win();
        else if (hareTime>tortoiseTime)
            t.win();
        else
            System.out.println("Draw!");

    }
    public static void main(String[] args){
        Sample10_TortoiseHareRace thr = new Sample10_TortoiseHareRace();
        thr.game(5,30,2,99);
    }
}
abstract class AnimalRacer{
    int speed;
    // return the time cost.
    public abstract double race(int distance);
    public abstract void win();
}

class Hare extends AnimalRacer{

    int sleepDuration;
    Hare(int s, int d ){
        //add some codes here
        speed = s;
        sleepDuration = d;
    }
    public double race(int distance){
        //add some codes here
        return distance*1.0/speed+sleepDuration;
    }
    public void win(){
        System.out.println("Hare Win!");
    }
}

class Tortoise extends AnimalRacer{
    Tortoise(int s){
        //add some codes here
        speed = s;
    }
    public double race(int distance){
        //add some codes here
        return distance*1.0/speed;

    }

    public void win(){
        System.out.println("Tortoise Win!");
    }
}