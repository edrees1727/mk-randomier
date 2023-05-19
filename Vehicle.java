import java.util.Random;
public class Vehicle extends Character implements VehicleType {
    private int speed;
    private int acceleration;
    private int traction;
    private int handling;
    private VehicleType type;

    public Vehicle(WeightClass weightClass,int speed, int acceleration, int traction,int handling, VehicleType type){
        super(weightClass);
        this.speed=speed;
        this.acceleration=acceleration;
        this.traction=traction;
        this.handling=handling;
        this.type=type;
    }
    public int getSpeed(){
        return speed;
    }
    public int getAcceleration(){
        return acceleration;
    }
    public int getTraction(){
        return traction;
    }
    public int getHandling(){
        return handling;
    }
    public VehicleType getType(){
        return type;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setAcceleration(int acceleration){
        this.acceleration=acceleration;
    }
    public void setTraction(int traction){
        this.traction= traction;
    }
    public void setHandling(int handling){
        this.handling=handling;
    }
    public void setType(VehicleType type ){
        this.type=type;
    }
    public void vehicleRandomizer() {
        Random random = new Random();
    }
       
    public String toString(){
        return super.toString() + "\nThe vehicle you are given is "+Randomizer.vehicleRandomizer();
    }

}
