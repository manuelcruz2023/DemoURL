package co.edu.uptc;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        DemoUrl demo = new DemoUrl();
        ExtractVehicles extract = new ExtractVehicles();
        try {
            //String data = demo.ReadURL("https://data.wa.gov/api/views/f6w7-q2d2/rows.json?accessType=DOWNLOAD");  
            demo.ReadData(demo.readTxt());
            extract.createVehicleList();
            extract.showVehicles();
        } catch (IOException | URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}