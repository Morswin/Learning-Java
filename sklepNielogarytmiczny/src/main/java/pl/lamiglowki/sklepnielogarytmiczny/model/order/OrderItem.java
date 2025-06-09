package pl.lamiglowki.sklepnielogarytmiczny.model.order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderItem {
    public OrderItem(Long orderId, Long itemId, int amount) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.itemId = itemId;
        this.amount = amount;
    }

    @Id
    @GeneratedValue
    private Long orderItemId;
    private Long orderId;
    private Long itemId;
    private int amount;
}
