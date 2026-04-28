public class TrainApp {
    public static void main(String[] args) {
        String[] bogieIDs = {"B1", "B5", "A2", "S9", "C3"};
        String searchKey = "S9";
        boolean found = false;

        System.out.println("--- UC18: Linear Search ---");
        for (int i = 0; i < bogieIDs.length; i++) {
            if (bogieIDs[i].equals(searchKey)) {
                System.out.println("Bogie " + searchKey + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Bogie not found.");
    }
}
