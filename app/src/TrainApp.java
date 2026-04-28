public class TrainApp {
    public static void main(String[] args) {
        System.out.println("--- UC15: Safe Cargo Assignment ---");
        String cargo = "Chemicals";
        boolean isSafeContainer = false;

        try {
            if (!isSafeContainer) {
                throw new Exception("Incompatible cargo for this bogie type!");
            }
            System.out.println("Cargo assigned: " + cargo);
        } catch (Exception e) {
            System.err.println("Assignment Failed: " + e.getMessage());
        } finally {
            System.out.println("Cleaning up assignment logs...");
        }
    }
}
