package dddfooddelivery.domain;

import dddfooddelivery.domain.*;
import dddfooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long status;
}


