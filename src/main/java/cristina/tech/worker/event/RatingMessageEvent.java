package cristina.tech.worker.event;

import cristina.tech.worker.domain.Rating;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper=true)
public class RatingMessageEvent extends DressEvent {

    private static final long serialVersionUID = 1126074635410771214L;

    private Rating payload;

    public RatingMessageEvent() {
        super(DressEventType.RATED);
    }

}