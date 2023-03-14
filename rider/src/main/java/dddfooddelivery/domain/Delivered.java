package dddfooddelivery.domain;

import dddfooddelivery.domain.*;
import dddfooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Delivered extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private String status;

    public Delivered(Delivery aggregate){
        super(aggregate);
    }
    public Delivered(){
        super();
    }
}
