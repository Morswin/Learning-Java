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
import java.util.Optional;

@Getter
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
//    private final ItemRepository itemRepository;
    private ArrayList<CartItem> cartItems = new ArrayList<CartItem>(){};
    private BigDecimal sum;
    private int counter = 0;

    public void addItem(Item item) {
        Optional<CartItem> oItem = cartItems.stream()
                .filter(ci -> ci.isEquals(item))
                .findFirst();
        oItem.ifPresentOrElse(
                CartItem::increaseCounter,
                () -> cartItems.add(new CartItem(item))
        );
        recalculatePriceAndCounter();
    }

    public void removeItem(Item item) {
        cartItems.stream()
                .filter(ci -> ci.isEquals(item))
                .findFirst()
                .ifPresent(ci -> {
                    ci.decreaseCounter();
                    if (ci.getCounter() <- 0) {
                        cartItems.remove(ci);
                    }
                    recalculatePriceAndCounter();
                });
    }

    public void recalculatePriceAndCounter() {
        this.counter = this.cartItems.stream().mapToInt(CartItem::getCounter).sum();
        this.sum = this.cartItems.stream().map(CartItem::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public int getCounter() {
        return this.counter;
    }
}
