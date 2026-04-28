import java.util.Arrays;

public class TrainApp {
    public static void main(String[] args) {
        String[] types = {"Sleeper", "AC-Chair", "First-Class", "General"};
        System.out.println("--- UC17: Sorting Bogie Names ---");

        Arrays.sort(types);

        System.out.println("Sorted Bogie Types: " + Arrays.toString(types));
    }
}
