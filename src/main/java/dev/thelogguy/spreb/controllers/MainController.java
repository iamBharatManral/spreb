package dev.thelogguy.spreb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
   @GetMapping("/")
   public String home(Model page, @RequestParam(defaultValue = "green") String color,
                      @RequestParam(defaultValue = "Guest") String name) {
       page.addAttribute("username", name);
       page.addAttribute("color", color);
       return "home.html";
   }
}
