import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("--- UC5: Preserving Attachment Order (LinkedHashSet) ---");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Locomotive-L1");
        formation.add("Passenger-S1");
        formation.add("Passenger-S2");
        formation.add("Goods-G1");
        formation.add("Guard-Coach");

        System.out.println("Final Train Formation Order:");
        formation.forEach(bogie -> System.out.println("Attached: " + bogie));
    }
}
