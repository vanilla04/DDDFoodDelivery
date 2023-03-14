package dddfooddelivery.domain;

import dddfooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Delivered extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private String status;
}
