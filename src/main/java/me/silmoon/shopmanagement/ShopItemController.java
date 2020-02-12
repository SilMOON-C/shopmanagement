package me.silmoon.shopmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopItemController {
    @Autowired
    private ShopItemRepo shopItemRepo;

    @GetMapping("/")
    public String getIndex(Model model) {
        return "index";
    }
}
