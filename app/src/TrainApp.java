import java.util.*;

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
        System.out.println("Ready for passenger boarding.");
    }
}
