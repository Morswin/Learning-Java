package pl.lamiglowki.sklepnielogarytmiczny.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.lamiglowki.sklepnielogarytmiczny.model.Item;
import pl.lamiglowki.sklepnielogarytmiczny.repository.ItemRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    private final ItemRepository itemRepository;

    @Autowired
    public HomeController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/")
//    @ResponseBody
    public String home(Model model) {
        List<Item> items = itemRepository.findAll();
//        return new Item("Ołówek", new BigDecimal("1.50"), "https://static.vecteezy.com/system/resources/thumbnails/002/098/203/small_2x/silver-tabby-cat-sitting-on-green-background-free-photo.jpg");
        model.addAttribute("items", items);
        return "home";
    }

    @GetMapping("/add/{itemId}")
    public String addItemToCart(@PathVariable("itemId") Long itemId, Model model, HttpSession session) {
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        if (cart==null) {
            cart = new ArrayList<>();
        }
        Optional<Item> oItem = itemRepository.findById(itemId);
        if (oItem.isPresent()) {
            Item item = oItem.get();
            cart.add(item);
            session.setAttribute("cart", cart);
        }
        model.addAttribute("items", itemRepository.findAll());
        return "home";
    }
}
