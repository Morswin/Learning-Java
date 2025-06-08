package pl.lamiglowki.sklepnielogarytmiczny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.lamiglowki.sklepnielogarytmiczny.model.Item;
import pl.lamiglowki.sklepnielogarytmiczny.service.CartService;
import java.util.List;

@Controller
public class HomeController {
    private final CartService cartService;

    public HomeController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Item> items = cartService.getAllItems();
        model.addAttribute("items", items);
        return "home";
    }

    @GetMapping("/add/{itemId}")
    public String addItemToCart(@PathVariable("itemId") Long itemId/*, Model model/*, HttpSession session*/) {
        cartService.addItemToCart(itemId);
        return "redirect:/";
    }
}
