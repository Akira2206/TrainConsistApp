import java.util.*;

public class TrainApp {
    public static void main(String[] args) {
        List<String> emptyTrain = new ArrayList<>();
        System.out.println("--- UC20: Search Safety Check ---");

        try {
            if (emptyTrain.isEmpty()) {
                throw new IllegalStateException("Cannot perform search: Train consists of zero bogies.");
            }
        } catch (IllegalStateException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
