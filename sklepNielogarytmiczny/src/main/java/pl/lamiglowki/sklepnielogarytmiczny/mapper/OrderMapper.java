package pl.lamiglowki.sklepnielogarytmiczny.mapper;

import pl.lamiglowki.sklepnielogarytmiczny.Cart;
import pl.lamiglowki.sklepnielogarytmiczny.CartItem;
import pl.lamiglowki.sklepnielogarytmiczny.dto.OrderDto;
import pl.lamiglowki.sklepnielogarytmiczny.model.order.Order;
import pl.lamiglowki.sklepnielogarytmiczny.model.order.OrderItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {
    public static Order mapToOrder(OrderDto orderDto) {
        return Order.builder()
                .firstName(orderDto.getFirstName())
                .lastName(orderDto.getLastName())
                .address(orderDto.getAddress())
                .postCode(orderDto.getPostCode())
                .city(orderDto.getCity())
                .created(LocalDateTime.now())
                .build();
    }

    public static List<OrderItem> maptoOrderItemList(Cart cart, Order order) {
        List<OrderItem> orderItems = new ArrayList<>();
        for (CartItem ci : cart.getCartItems()) {
            orderItems.add(new OrderItem(order.getOrderId(), ci.getItem().getId(), ci.getCounter()));
        }
        return orderItems;
    }
}
