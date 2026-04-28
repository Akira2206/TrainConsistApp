import java.util.Arrays;

public class TrainApp {
    public static void main(String[] args) {
        String[] bogieIDs = {"A1", "A2", "B1", "B2", "S1"}; // Must be sorted
        String searchKey = "B2";
        
        System.out.println("--- UC19: Binary Search ---");
        int low = 0, high = bogieIDs.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = searchKey.compareTo(bogieIDs[mid]);

            if (res == 0) {
                result = mid;
                break;
            }
            if (res > 0) low = mid + 1;
            else high = mid - 1;
        }

        System.out.println(result != -1 ? "Bogie found at index " + result : "Not found.");
    }
}
