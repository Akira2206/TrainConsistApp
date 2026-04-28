public class TrainApp {
    public static void main(String[] args) {
        int[] capacities = {72, 24, 56, 72, 18};
        System.out.println("--- UC16: Bubble Sort Capacities ---");

        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Sorted Capacities: ");
        for (int c : capacities) System.out.print(c + " ");
        System.out.println();
    }
}
