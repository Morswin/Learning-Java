package pl.lamiglowki.sklepnielogarytmiczny;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import pl.lamiglowki.sklepnielogarytmiczny.model.Item;
import pl.lamiglowki.sklepnielogarytmiczny.repository.ItemRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
//    private final ItemRepository itemRepository;
    private ArrayList<CartItem> cartItems = new ArrayList<CartItem>(){};
    private BigDecimal sum;
    private int counter = 0;
//    public Cart(ItemRepository itemRepository) {
//        this.itemRepository = itemRepository;
//        List<Item> items = new ArrayList<>(itemRepository.findAll());
//        for (Item item : items) {
//            addItem(item);
//            addItem(item);
//        }
//    }
    public void addItem(Item item) {
//        System.out.println(cartItems);
        if (!cartItems.isEmpty()) {
            boolean found = false;
            for (CartItem cartItem : cartItems) {
                if (cartItem.isEquals(item)) {
                    cartItem.increaseCounter();
                    found = true;
                    break;
                }
            }
            if (!found) {
                cartItems.add(new CartItem(item));
            }
        }
        else {
            CartItem nowy = new CartItem(item);
            cartItems.add(nowy);
        }
        recalculatePriceAndCounter();
    }
    public void removeItem(Item item) {
        if (!cartItems.isEmpty()) {
            for (CartItem cartItem : cartItems) {
                if (cartItem.isEquals(item)) {
                    cartItem.decreaseCounter();
                    if (cartItem.getCounter() <= 0) {
                        cartItems.remove(cartItem);
                    }
                    recalculatePriceAndCounter();
                    break;
                }
            }
        }
    }
    public void recalculatePriceAndCounter() {
        this.counter = this.cartItems.stream().mapToInt(CartItem::getCounter).sum();
        this.sum = this.cartItems.stream().map(CartItem::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
    public int getCounter() {
        return this.counter;
    }
}
