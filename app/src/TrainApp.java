import java.util.HashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("--- UC3: Unique Bogie ID Tracking (HashSet) ---");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        System.out.println("Adding duplicate BG101...");
        boolean isAdded = bogieIds.add("BG101"); 

        System.out.println("Was duplicate added? " + isAdded);
        System.out.println("Unique Bogie IDs in System: " + bogieIds);
    }
}
