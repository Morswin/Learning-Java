package pl.lamiglowki.sklepnielogarytmiczny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.lamiglowki.sklepnielogarytmiczny.ItemOperation;
import pl.lamiglowki.sklepnielogarytmiczny.dto.OrderDto;
import pl.lamiglowki.sklepnielogarytmiczny.service.CartService;

import java.util.Optional;

@Controller
@RequestMapping("/order")
public class OrderController {
    private final CartService cartService;

    public OrderController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/cart")
    public String showCart() {
        return "cartView";
    }

    @GetMapping("/add/{itemId}")
    public String addItemToCart(@PathVariable("itemId") Long itemId/*, Model model/*, HttpSession session*/) {
        cartService.itemOperation(itemId, ItemOperation.INCREASE);
        return "redirect:/order/cart";
    }

    @GetMapping("/remove/{itemId}")
    public String removeItemFromCart(@PathVariable("itemId") Long itemId) {
        cartService.itemOperation(itemId, ItemOperation.DECREASE);
        return "redirect:/order/cart";
    }

    @GetMapping("/removeCompletely/{itemId}")
    public String removeItemCompletelyFromCart(@PathVariable("itemId") long itemId) {
        cartService.itemOperation(itemId, ItemOperation.REMOVE);
        return "redirect:/order/cart";
    }

    @GetMapping("/summary")
    public String showSummary() {
        return "summary";
    }

    @PostMapping("/saveorder")
    public String saveOrder(OrderDto orderDto) {
        return "redirect:/";
    }
}
