package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private String orderid;

    public Accepted(Cooking aggregate) {
        super(aggregate);
    }

    public Accepted() {
        super();
    }
}
