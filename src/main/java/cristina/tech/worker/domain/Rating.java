package cristina.tech.worker.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * JSON Payload of {@link cristina.tech.worker.event.DressRatedEvent}.
 */
@Data
@NoArgsConstructor(force = true) //Jackson JSON needs this for deserialization
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rating implements Serializable {

    private String dressId, ratingId;
    private Integer stars;

}