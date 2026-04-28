import java.util.*;
import java.util.function.Predicate;

class Bogie {
    String type;
    int capacity;
    String cargoType;
    boolean isCylindrical;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    Bogie(String type, String cargoType, boolean isCylindrical) {
        this.type = type;
        this.cargoType = cargoType;
        this.isCylindrical = isCylindrical;
    }

    public int getCapacity() { return capacity; }
}

public class TrainApp {
    public static void main(String[] args) {
        List<Bogie> goodsTrain = Arrays.asList(
            new Bogie("Wagon", "Coal", false),
            new Bogie("Tanker", "Oil", true),
            new Bogie("Tanker", "Gas", true)
        );

        System.out.println("--- UC12: Safety Compliance Check ---");
        Predicate<Bogie> safetyRule = b -> !b.isCylindrical || (b.cargoType.equals("Oil") || b.cargoType.equals("Gas"));

        boolean isSafe = goodsTrain.stream().allMatch(safetyRule);

        if (isSafe) {
            System.out.println("All goods bogies comply with safety regulations.");
        } else {
            System.out.println("Safety Alert: Hazardous cargo detected in improper container!");
        }
    }
}
