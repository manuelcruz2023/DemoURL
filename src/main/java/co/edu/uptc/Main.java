package co.edu.uptc;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        ExtractVehicles extractVehicles = new ExtractVehicles();
        try {
            extractVehicles.createVehicleList();
            extractVehicles.showVehicles();
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
}