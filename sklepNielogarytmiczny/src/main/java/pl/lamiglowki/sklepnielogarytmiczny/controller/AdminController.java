package pl.lamiglowki.sklepnielogarytmiczny.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.lamiglowki.sklepnielogarytmiczny.model.Item;
import pl.lamiglowki.sklepnielogarytmiczny.model.order.Order;
import pl.lamiglowki.sklepnielogarytmiczny.repository.ItemRepository;
import pl.lamiglowki.sklepnielogarytmiczny.repository.order.OrderRepository;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;

    @Autowired
    public AdminController(ItemRepository itemRepository, OrderRepository orderRepository) {
        this.itemRepository = itemRepository;
        this.orderRepository = orderRepository;
    }

    @GetMapping
    private String adminPage() {
        return "adminview/addItem";
    }

    @PostMapping
    private String addItem(Item item) {
        itemRepository.save(item);
//        HomeController.items.add(item);
        return "redirect:/";
    }

    @GetMapping("/showorders")
    @ResponseBody
    public List<Order> showOrders() {
        return orderRepository.findAll();
    }
}
