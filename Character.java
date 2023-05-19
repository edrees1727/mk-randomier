import java.util.Random;
public class Character{
    private WeightClass weightClass;
    public Character(WeightClass weightClass){
        this.weightClass=weightClass;
        
    }   
    public WeightClass getWeightClass(){
        return weightClass;
    }
    
    public void setWeightClass(WeightClass weightClass){
        this.weightClass=weightClass;
    }
    
    public String randomCharacters(){
        Random random=new Random();
            if (weightClass == WeightClass.LIGHT) {
            String[] lname = {"Toad", "Shy Guy", "Toadette", "Bowser Jr", "Isabelle"};
            int randomIndex = random.nextInt(lname.length);
            return lname[randomIndex];
        } 
        if (weightClass == WeightClass.MEDIUM) {
            String[] mname = {"Princess Daisy", "Yoshi", "Mario", "Luigi", "Princess Peach"};
            int randomIndex = random.nextInt(mname.length);
            return mname[randomIndex];
        } 
        if (weightClass == WeightClass.HEAVY) {
            String[] hname = {"Waluigi", "Bowser", "Wario", "King Boo", "Donkey Kong"};
            int randomIndex = random.nextInt(hname.length);
            return hname[randomIndex];
        }
        else{
            throw new IllegalArgumentException("The weight class that was entered was invalid.");
        }
    
        

    }
    public String toString(){
        return " character is "+ randomCharacters();
    }
}