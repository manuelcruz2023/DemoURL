package co.edu.uptc;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class ExtractVehicles {

    public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public ArrayList<Vehicle> createVehicleList() throws IOException, URISyntaxException {
        DemoUrl demo = new DemoUrl();
        String data = demo.ReadURL("https://data.wa.gov/api/views/f6w7-q2d2/rows.json?accessType=DOWNLOAD");
        for (ArrayList<Object> element : demo.ReadData(data).data) {
            vehicles.add(createVehicle(element));
            break;
        }
        return vehicles;
    }

    public Vehicle createVehicle(ArrayList<Object> element) {
        Vehicle vehicle = new Vehicle();
        vehicle.setCountry((String) element.get(9));
        vehicle.setCity((String) element.get(10));
        vehicle.setState((String) element.get(11));
        vehicle.setManuFacturer((String) element.get(14));
        vehicle.setModelVehicle((String) element.get(15));
        vehicle.setElectricRange(Integer.parseInt((String) element.get(18))); // Conversión adecuada
        return vehicle;
    }

    public void showVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(
                vehicle.getCountry() + " " 
                + vehicle.getCity() + " " 
                + vehicle.getState() + " "
                + vehicle.getManuFacturer() + " " 
                + vehicle.getModelVehicle() + " "
                + vehicle.getElectricRange());
        }
    }
    
    /*
     * Snohomish - 9
     * Mukilteo - 10
     * WA - 11
     * Tesla - 14
     * Model S - 15
     * 270 - 18
     */

    // public static void main(String[] args) {
    //     DemoUrl demo = new DemoUrl();
    //     try {
    //         String data = demo.ReadURL("https://data.wa.gov/api/views/f6w7-q2d2/rows.json?accessType=DOWNLOAD");
    //         demo.ReadData(data);
    //         for (ArrayList element : demo.ReadData(data).data) {
    //             // for (int i = 0; i < 19; i++) {
    //             // System.out.println("--------------");
    //             // System.out.println(element.get(i));
    //             // }
    //             for (Object elem : element) {
    //                 System.out.println(elem);
    //             }
    //             break;
    //         }
    //     } catch (IOException | URISyntaxException e) {
    //         e.printStackTrace();
    //     }
    // }
}
