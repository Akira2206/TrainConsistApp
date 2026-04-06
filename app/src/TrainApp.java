import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() { return type; }

    @Override
    public String toString() {
        return "[Cap: " + capacity + "]";
    }
}

public class TrainApp {
    public static void main(String[] args) {
        List<Bogie> train = Arrays.asList(
            new Bogie("Sleeper", 72),
            new Bogie("AC-Chair", 56),
            new Bogie("Sleeper", 72),
            new Bogie("First-Class", 24)
        );

        System.out.println("--- UC9: Grouping Bogies by Category ---");

        Map<String, List<Bogie>> groupedByType = train.stream()
            .collect(Collectors.groupingBy(Bogie::getType));

        groupedByType.forEach((type, list) -> {
            System.out.println(type + " Bogies: " + list);
        });
    }
}
