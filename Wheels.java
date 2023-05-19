public abstract class Wheels extends Randomizer{
    private String type;

    public Wheels(String preference, String preferencetwo){
        this.type=Randomizer.randomWheels(preference, preferencetwo);
    }
    
    public String getType(){
        return type;
    }
    public abstract String randomWheels();
    public String toString(){
        return "The preferred wheel is "+type;
    }
}
