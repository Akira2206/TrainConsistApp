import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainApp {
    public static void main(String[] args) {
        List<Bogie> trainList = new ArrayList<>();
        trainList.add(new Bogie("Sleeper-S1", 72));
        trainList.add(new Bogie("AC-Chair-C1", 56));
        trainList.add(new Bogie("First-Class-F1", 24));

        trainList.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("Bogies Sorted by Capacity:");
        trainList.forEach(System.out::println);
    }
}
