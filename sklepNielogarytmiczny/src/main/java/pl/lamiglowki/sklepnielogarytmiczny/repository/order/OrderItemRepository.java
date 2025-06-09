package pl.lamiglowki.sklepnielogarytmiczny.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lamiglowki.sklepnielogarytmiczny.model.order.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
