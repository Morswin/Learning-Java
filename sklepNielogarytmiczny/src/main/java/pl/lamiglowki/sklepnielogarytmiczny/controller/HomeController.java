package pl.lamiglowki.sklepnielogarytmiczny.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.lamiglowki.sklepnielogarytmiczny.model.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    static List<Item> items = new ArrayList<>();
    static {
        items.add(new Item("Ołówek", new BigDecimal("1.30"), "https://static.vecteezy.com/system/resources/thumbnails/002/098/203/small_2x/silver-tabby-cat-sitting-on-green-background-free-photo.jpg"));
        items.add(new Item("Ołówek", new BigDecimal("1.40"), "https://cdn.hswstatic.com/gif/frog-1.jpg"));
        items.add(new Item("Ołówek", new BigDecimal("1.90"), "https://static.libertyprim.com/files/familles/pomme-large.jpg?1569271834"));
    }

    @GetMapping("/")
//    @ResponseBody
    public String home(Model model) {
//        return new Item("Ołówek", new BigDecimal("1.50"), "https://static.vecteezy.com/system/resources/thumbnails/002/098/203/small_2x/silver-tabby-cat-sitting-on-green-background-free-photo.jpg");
        model.addAttribute("items", items);
        return "home";
    }
}
