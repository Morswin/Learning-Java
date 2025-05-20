package pl.lamiglowki.sklepnielogarytmiczny;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import pl.lamiglowki.sklepnielogarytmiczny.model.Item;

import java.math.BigDecimal;
import java.util.ArrayList;

@Getter
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
    private ArrayList<CartItem> cartItems = new ArrayList<CartItem>(){};
    private BigDecimal sum;
    private int counter = 0;
    public void addItem(Item item) {
//        System.out.println(cartItems);
        if (!cartItems.isEmpty()) {
            boolean found = false;
            for (CartItem cartItem : cartItems) {
                if (cartItem.getItem().getId().equals(item.getId())) {
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
//            nowy.increaseCounter();
            cartItems.add(nowy);
        }
        recalculatePriceAndCounter();
    }
    public void removeItem(Item item) {
        if (!cartItems.isEmpty()) {
            for (CartItem cartItem : cartItems) {
                if (cartItem.getItem().getId().equals(item.getId())) {
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
        counter = 0;
        sum = new BigDecimal(0);
        System.out.println("Przed przeliczeniem: " + counter);
        for (CartItem cartItem : cartItems) {
            counter += cartItem.getCounter();
            sum = sum.add(cartItem.getPrice());
            System.out.println("W trakcie: " + counter);
        }
        System.out.println("Po przeliczeniu: " + counter);
    }
    public int getCounter() {
        return this.counter;
    }
}
