package com.kocirfan.controller;

import com.kocirfan.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    //http://localhost:8080
    @GetMapping({"/", "index"})
    public String index(){
        return "index";
    }

    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
    public String getThymeleaf1() {
        return "thymeleaf1";
    }

    //***** Model kullanımı

    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model) {
        model.addAttribute("key_model1", "ben modelden geldim-1");
        model.addAttribute("key_model2", "ben modelden geldim-2");
        return "thymeleaf1";
    }

    //http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model) {
        model.addAttribute("key_model3", "alt file dosyasından geldim");
        model.addAttribute("key_model4", "alt file dosyasından geldim");
        return "thymeleaf_file/thymeleaf3";
    }

    //http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model) {
        model.addAttribute("key_model5", "messages file dosyasından geldim");
        return "thymeleaf4";
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Model Object

    //http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5Model(Model model) {
        model.addAttribute("key_model6", "object");

        ProductDto productDto= ProductDto
                .builder()
                    .productId(1L)
                    .productName("Süper Product")
                    .productPrice(15)
                .build();
        model.addAttribute("key_model7", productDto);

        return "thymeleaf5";
    }

    //Model Object List

    //http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String getThymeleaf6Model(Model model) {
        model.addAttribute("key_model8", "object");
        List<ProductDto> listem = new ArrayList<>();
        listem.add(ProductDto.builder().productId(1L).productName("Süper Product").productPrice(15).build());
        listem.add(ProductDto.builder().productId(2L).productName("Acayip Product").productPrice(25).build());
        listem.add(ProductDto.builder().productId(3L).productName("Efsane Product").productPrice(35).build());
        listem.add(ProductDto.builder().productId(4L).productName("Süper Product").productPrice(15).build());
        listem.add(ProductDto.builder().productId(5L).productName("Acayip Product").productPrice(25).build());
        listem.add(ProductDto.builder().productId(6L).productName("Efsane Product").productPrice(35).build());
        listem.add(ProductDto.builder().productId(7L).productName("Süper Product").productPrice(15).build());
        listem.add(ProductDto.builder().productId(8L).productName("Acayip Product").productPrice(25).build());
        listem.add(ProductDto.builder().productId(9L).productName("Efsane Product").productPrice(35).build());

        model.addAttribute("product_liste", listem);

        return "thymeleaf6";
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Path Veriable

    //http://localhost:8080/thymeleaf7/4
    @GetMapping({"/thymeleaf7","/thymeleaf7/{id}"})
    public String getThymeleaf7Model(Model model, @PathVariable(name = "id", required = false) Long id) {
        if(id!=null){
            model.addAttribute("key_model9", "id: " +id);
        }else{
            model.addAttribute("key_model10", "id bulunamadı ");
        }
    return "thymeleaf7";
    }
}
