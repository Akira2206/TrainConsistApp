import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return type + " (Seats: " + capacity + ")";
    }
}

public class TrainApp {
    public static void main(String[] args) {
        List<Bogie> train = Arrays.asList(
            new Bogie("Sleeper", 72),
            new Bogie("AC-Chair", 56),
            new Bogie("First-Class", 24),
            new Bogie("Sleeper", 72)
        );

        System.out.println("--- UC8: Filtering High-Capacity Bogies (> 50 seats) ---");

        List<Bogie> highCapacityBogies = train.stream()
            .filter(b -> b.getCapacity() > 50)
            .collect(Collectors.toList());

        highCapacityBogies.forEach(System.out::println);
    }
}
