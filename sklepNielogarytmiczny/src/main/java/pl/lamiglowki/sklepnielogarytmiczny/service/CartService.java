package pl.lamiglowki.sklepnielogarytmiczny.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lamiglowki.sklepnielogarytmiczny.Cart;
import pl.lamiglowki.sklepnielogarytmiczny.model.Item;
import pl.lamiglowki.sklepnielogarytmiczny.repository.ItemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    private final ItemRepository itemRepository;
    private final Cart cart;

    @Autowired
    public CartService(ItemRepository itemRepository, Cart cart) {
        this.itemRepository = itemRepository;
        this.cart = cart;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public void addItemToCart(Long itemId) {
        Optional<Item> oItem = itemRepository.findById(itemId);
        if (oItem.isPresent()) {
            cart.addItem(oItem.get());
        }
    }

    public void removeItemFromCart(Long itemId) {
        Optional<Item> oItem = itemRepository.findById(itemId);
        if (oItem.isPresent()) {
            cart.removeItem(oItem.get());
        }
    }

    public void removeItemCompletelyFromCart(Long itemId) {
        Optional<Item> oItem = itemRepository.findById(itemId);
        if (oItem.isPresent()) {
            cart.removeItemCompletely(oItem.get());
        }
    }
}
