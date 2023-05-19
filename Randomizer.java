import java.util.Random;
import java.util.Scanner;
public class Randomizer{
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your desired weight class");
        
        
        String wc=scanner.nextLine().toUpperCase();
        WeightClass weightClass=WeightClass.valueOf(wc);
        Character character =new Character(weightClass);
        String a=character.toString();
        System.out.println(a);


        System.out.print("Enter your preference (speed/acceleration): ");
        String preference = scanner.nextLine();

        
        System.out.print("Enter your preference (traction/handling): ");
        String preferencetwo = scanner.nextLine();
        String randomWheel = randomWheels(preference, preferencetwo);
        String tos= randomWheel.toString();


        System.out.print("Enter your preference in the air (speed/float): ");
        String preferencee = scanner.nextLine();
        String randomGlider = randomGlider(preferencee);
        String rglider=randomGlider.toString();
        System.out.println(rglider);
        String vehicle = vehicleRandomizer();


        System.out.println("You're randomized, "+a+"\nVehicle: "+vehicle+"\nWheels: "+tos+"\nGlider: "+rglider);
        scanner.close();
    }   
    public static String vehicleRandomizer() {
        Random random = new Random();
        
        
        int speed = random.nextInt(5); 
        int acceleration = random.nextInt(5); 
        int traction = random.nextInt(5); 
        int handling = random.nextInt(5); 
        if (speed>2&&acceleration<2){
            if (traction>2 &&handling>1){
                String[] vehicleTypesspt = {"Steel Driver","Circuit Special","Tri-Speeder","Badwagon"};
                int randomIndex = random.nextInt(vehicleTypesspt.length);
                return vehicleTypesspt[randomIndex];
            }
            else{
                String[] vehicleTypesspt = {"Pipe Frame","Cat Cruiser","Prancer"};
                int randomIndex = random.nextInt(vehicleTypesspt.length);
                return vehicleTypesspt[randomIndex];
            }
            
            
        }
        if (speed<2&&acceleration>2){
            if (traction>2&&handling>1){
                String[] vehicleTypesac = {"BiddyBuggy","Landship","Sports Coupe","Cat Cruiser",};
                int randomIndex = random.nextInt(vehicleTypesac.length);
                return vehicleTypesac[randomIndex];
            }
        }
        else{
            String [] vehicleel={"Mercedes GLA","Tanooki Kart","Streetle"};
            int randomIndex = random.nextInt(vehicleel.length);
            return vehicleel[randomIndex];
        }
        return "Standard Kart";

    
        
    }
    public static String randomWheels(String preference, String preferencetwo){
        Random random=new Random();
        if (preference.equals("speed")) {
            if (preferencetwo.equals("traction")) {
                String[] speedTraction = {"Monster", "Cyber Slick", "Hot Monster"};
                int randomIndex = random.nextInt(speedTraction.length);
                return speedTraction[randomIndex];
            }
            if (preferencetwo.equals("handling")) {
                String[] speedHandling = {"Slim", "Crimson Slim", "Gold Tires", "Cyber Slick", "Slick"};
                int randomIndex = random.nextInt(speedHandling.length);
                return speedHandling[randomIndex];
            }
        }
        if (preference.equals("acceleration")) {
            if (preferencetwo.equals("traction")) {
                String[] accelerationTraction = {"Sponge", "Cushion", "Wood", "Sponge"};
                int randomIndex = random.nextInt(accelerationTraction.length);
                return accelerationTraction[randomIndex];
            }
            if (preferencetwo.equals("handling")) {
                String[] accelerationHandling = {"Button", "Azure Roller", "Roller"};
                int randomIndex = random.nextInt(accelerationHandling.length);
                return accelerationHandling[randomIndex];
            }
        }
            throw new IllegalArgumentException("Choose either speed or acceleration for the first argument, \nchoose handling or traction for second argument");
    }
    public static String randomGlider(String preference) {
        Random random = new Random();
        if (preference.equals("speed")) {
            String[] speedGlider = {"Super Glider", "Wario Wing", "Waddle Wing", "Plane Glider", "Gold Glider"};
            int randomIndex = random.nextInt(speedGlider.length);
            return speedGlider[randomIndex];
        }
        if (preference.equals("float")) {
            String[] accelerationGlider = {"Cloud Glider", "Peach Parasol", "Parachute", "Parafoil", "Bowser Kite"};
            int randomIndex = random.nextInt(accelerationGlider.length);
            return accelerationGlider[randomIndex];
        }
        throw new IllegalArgumentException("Choose either air speed or air float for the preference");
    }
    


    
    



}
