public abstract class Glider extends Randomizer{
    private String type;

    public Glider(String preferencee){
        this.type=Randomizer.randomGlider(preferencee);
    }
    
    public String getType(){
        return type;
    }
    public String toString(){
        return "The preferred glider is "+type;
    }
    public abstract String randomGlider();
}

