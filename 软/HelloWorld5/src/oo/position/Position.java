package oo.position;

public class Position{
    private double longitude;
    private double latitude;

    public Position(double lo, double la){
        longitude = lo;
        latitude = la;
    }
    public double getLongtitude(){
        return longitude;
    }
    public double getlatitude(){
        return latitude;
    }
    public void setLongtitude(double d){
        longitude = d;
    }
    public void setlatitude(double d){
        latitude = d;
    }

    public double distance(Position p){
//this.longitude this.latitude p.longitude p.latitude
        return 0.0;
    }

    public static void main(String[] args){
        Position p1 = new Position(111,35);
        Position p2 = new Position(108,36);
        double d = p1.distance(p2);
    }
}