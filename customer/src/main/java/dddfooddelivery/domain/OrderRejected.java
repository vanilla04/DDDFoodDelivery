package dddfooddelivery.domain;

import dddfooddelivery.domain.*;
import dddfooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long custumerId;
    private Long foodId;
    private Integer qty;
    private Long storeId;
    private String address;
    private String status;
}


