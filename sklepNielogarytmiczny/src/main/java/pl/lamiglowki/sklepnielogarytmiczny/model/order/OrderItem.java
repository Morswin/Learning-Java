package pl.lamiglowki.sklepnielogarytmiczny.model.order;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="orderitem")
@Data
public class OrderItem implements Serializable {
    public OrderItem(Long orderId, Long itemId, int amount) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.itemId = itemId;
        this.amount = amount;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long orderItemId;
    private Long orderId;
    private Long itemId;
    private int amount;
}
