package dddfooddelivery.domain;

import dddfooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Picked extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private String status;
}
