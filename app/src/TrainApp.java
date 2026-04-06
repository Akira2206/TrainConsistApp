import java.util.SortedSet;
import java.util.TreeSet;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("--- UC4: Ordered Bogie ID Management (TreeSet) ---");

        SortedSet<String> orderedIds = new TreeSet<>();

        orderedIds.add("BG105");
        orderedIds.add("BG101");
        orderedIds.add("BG103");
        orderedIds.add("BG102");

        System.out.println("Sorted Bogie IDs for Formation:");
        for (String id : orderedIds) {
            System.out.println("Positioning Bogie: " + id);
        }

        System.out.println("First Bogie: " + orderedIds.first());
        System.out.println("Last Bogie: " + orderedIds.last());
    }
}
