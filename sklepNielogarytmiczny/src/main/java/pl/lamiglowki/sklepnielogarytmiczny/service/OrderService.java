package pl.lamiglowki.sklepnielogarytmiczny.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lamiglowki.sklepnielogarytmiczny.Cart;
import pl.lamiglowki.sklepnielogarytmiczny.dto.OrderDto;
import pl.lamiglowki.sklepnielogarytmiczny.mapper.OrderMapper;
import pl.lamiglowki.sklepnielogarytmiczny.model.order.Order;
import pl.lamiglowki.sklepnielogarytmiczny.repository.order.OrderItemRepository;
import pl.lamiglowki.sklepnielogarytmiczny.repository.order.OrderRepository;

@Service
public class OrderService {
    private final Cart cart;
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderService(Cart cart, OrderRepository orderRepository, OrderItemRepository orderItemRepository) {
        this.cart = cart;
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }
    public void saveOrder(OrderDto orderDto) {
        Order order = OrderMapper.mapToOrder(orderDto);
        orderRepository.save(order);
        orderItemRepository.saveAll(OrderMapper.maptoOrderItemList(cart, order));
        cart.cleanCart();
    }
}
