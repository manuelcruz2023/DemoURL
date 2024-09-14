package co.edu.uptc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoUrl {

    public String ReadURL(String urlData) throws URISyntaxException, IOException {
        URI uri = new URI(urlData);
        URL url = uri.toURL();
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }

        // ObjectMapper om = new ObjectMapper();
        // Data data = om.readValue(sb.toString(), Data.class);
        // for (ArrayList element : data.data) {
        // for (Object elem : element) {
        // System.out.println(elem);
        // }
        // break;
        // }
        return sb.toString();
    }

    public Data ReadData(String json) throws IOException {
        ObjectMapper om = new ObjectMapper();
        return om.readValue(json, Data.class);
    }
}
