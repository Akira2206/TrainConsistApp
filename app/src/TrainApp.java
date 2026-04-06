package com.railway;
import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        List<String> passengerBogies = new ArrayList<>();
    
        passengerBogies.add("Sleeper-S1");
        passengerBogies.add("AC-Chair-C1");
        passengerBogies.add("FirstClass-F1");
        System.out.println("Added Bogies: " + passengerBogies);

        passengerBogies.remove("AC-Chair-C1");
        System.out.println("After Removal: " + passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper-S1");
        System.out.println("Is Sleeper-S1 present? " + exists);
    }
}
