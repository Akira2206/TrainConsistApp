class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) { super(message); }
}

class Bogie {
    int capacity;
    Bogie(int capacity) throws InvalidCapacityException {
        if (capacity <= 0) throw new InvalidCapacityException("Capacity must be greater than zero!");
        this.capacity = capacity;
    }
}

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("--- UC14: Enforcing Capacity Rules ---");
        try {
            Bogie b = new Bogie(-5);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
