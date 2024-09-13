package co.edu.uptc;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DemoUrl demo = new DemoUrl();
        try {
            String data = demo.ReadURL("https://data.wa.gov/api/views/f6w7-q2d2/rows.json?accessType=DOWNLOAD");
            demo.ReadData(data);
            for (ArrayList element : demo.ReadData(data).data) {
                for (Object elem : element) {
                    System.out.println(elem);
                }
                break;
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}