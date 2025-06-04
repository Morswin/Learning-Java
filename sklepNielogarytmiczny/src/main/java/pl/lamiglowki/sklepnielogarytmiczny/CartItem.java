package pl.lamiglowki.sklepnielogarytmiczny;

import lombok.Getter;
import pl.lamiglowki.sklepnielogarytmiczny.model.Item;

import java.math.BigDecimal;

@Getter
public class CartItem {
    private Item item;
    private int counter;
    private BigDecimal price;
    public CartItem(Item item) {
        this.item = item;
        this.counter = 1;
        this.price = item.getPrice();
    }
    public void increaseCounter() {
        counter++;
        recalculate();
    }
    public void decreaseCounter() {
        // Czy to nie trzeba sprawdzić czy nie spadnie poniżej 0?
        counter--;
        recalculate();
    }
    public boolean isEquals(Item item) {
        return this.item.getId().equals(item.getId());
    }
    public void recalculate() {
        price = item.getPrice().multiply(new BigDecimal(counter));
    }
    public boolean hasZeroItems() {
        return counter <= 0;
    }
    public Item getItem() {
        return this.item;
    }
    public int getCounter() {
        return this.counter;
    }
    public BigDecimal getPrice() {
        return this.price;
    }
}
