package com.example.demo.controller;

import com.example.demo.model.product;
import com.example.demo.model.respositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class MainController {
    @Autowired
    ProductRepository productRepository;
    @GetMapping("/")
    public String showIndex(Model model)
    {
        String mymessage ="WEllcome to the invoice app";
        model.addAttribute("message", mymessage);
       return "index" ;
    }
@GetMapping("/addProduct")
    public String addProduct(Model model) {

        model.addAttribute("newProduct", new product());
    return "addProduct";

}
@PostMapping("/addProduct")
public String postProduct(@Valid @ModelAttribute("newProduct") product product, BindingResult bindingResult){
        System.out.println(bindingResult.toString());
    System.out.println(product.getDescription());

        if(bindingResult .hasErrors()){
            return "addProduct";
        }
        return "result";

}
}
