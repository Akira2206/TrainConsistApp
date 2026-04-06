import java.util.HashMap;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("--- UC6: Bogie Capacity Mapping (HashMap) ---");

        Map<String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC-ChairCar", 56);
        capacityMap.put("First-Class", 24);
        capacityMap.put("Rectangular-Goods", 1000);

        System.out.println("Bogie Capacity Directory:");
        for (String type : capacityMap.keySet()) {
            System.out.println("Type: " + type + " | Capacity: " + capacityMap.get(type));
        }
    }
}
