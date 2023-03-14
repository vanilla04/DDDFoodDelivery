package dddfooddelivery.domain;

import dddfooddelivery.domain.*;
import dddfooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Picked extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private String status;

    public Picked(Delivery aggregate){
        super(aggregate);
    }
    public Picked(){
        super();
    }
}