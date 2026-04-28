import java.util.*;

public class TrainApp {
    public static void main(String[] args) {
        List<Integer> capacities = new ArrayList<>();
        for (int i = 0; i < 100000; i++) capacities.add(i);

        System.out.println("--- UC13: Performance Comparison ---");

        long startLoop = System.nanoTime();
        int sumLoop = 0;
        for (int c : capacities) {
            if (c % 2 == 0) sumLoop += c;
        }
        long endLoop = System.nanoTime();
        System.out.println("Loop Time: " + (endLoop - startLoop) + " ns");

        long startStream = System.nanoTime();
        long sumStream = capacities.stream().filter(c -> c % 2 == 0).mapToInt(Integer::intValue).sum();
        long endStream = System.nanoTime();
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");
    }
}
