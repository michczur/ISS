package model;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.entity.StationPosition;

import java.io.IOException;
import java.net.URL;

public class Model {
    private StationPosition position;
    public Model() {
        ObjectMapper om = new ObjectMapper();
        try {
            position = om.readValue(new URL("http://api.open-notify.org/iss-now.json"), StationPosition.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public StationPosition getPosition() {
        return position;
    }
}
