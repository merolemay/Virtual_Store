package icesi.VirtualStore.model;


import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "order_item")
@Entity
@Data
public class OrderItem {
    @Id
    @Type(type = "org.hibernate.type.PostgresUUIDType")
    private UUID orderItemId;

    private int quantity;


    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
