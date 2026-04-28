import java.util.*;
import java.util.regex.*;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; }
}

public class TrainApp {
    public static void main(String[] args) {
        List<Bogie> train = Arrays.asList(
            new Bogie("Sleeper", 72),
            new Bogie("Sleeper", 72),
            new Bogie("AC-Chair", 56),
            new Bogie("First-Class", 24)
        );

        System.out.println("--- UC10: Calculating Total Seating Capacity ---");
        int totalSeats = train.stream()
            .map(Bogie::getCapacity)
            .reduce(0, (sum, cap) -> sum + cap);
        System.out.println("Total Seating Capacity for the Train: " + totalSeats);

        System.out.println("\n--- UC11: Validate Train ID & Cargo Codes ---");
        String trainID = "TRN-12345";
        String cargoCode = "CRG99";

        String trainRegex = "^TRN-\\d{5}$";
        String cargoRegex = "^[A-Z]{3}\\d{2}$";

        boolean isTrainValid = Pattern.matches(trainRegex, trainID);
        boolean isCargoValid = Pattern.matches(cargoRegex, cargoCode);

        if (isTrainValid && isCargoValid) {
            System.out.println("Validation Successful: Train ID and Cargo Code are in correct format.");
        } else {
            System.out.println("Validation Failed: Check ID/Code formats.");
        }
    }
}
