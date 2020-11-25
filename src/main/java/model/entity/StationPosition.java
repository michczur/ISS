package model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/*
iss_position
latitude	"39.4971"
longitude	"-165.9290"
message	"success"
timestamp	1604660411
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StationPosition {
    @JsonProperty("iss_position")
    private Position issPosition;
    private String massage;
    private Timestamp timestamp;

}
