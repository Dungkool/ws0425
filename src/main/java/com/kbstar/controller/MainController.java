package com.kbstar.controller;

import com.kbstar.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping("/")
    public String main(){
        return "index";
    }

    @RequestMapping("/charts")
    public String charts(Model model){
        model.addAttribute("center","charts");
        return "index";
    }

    @RequestMapping("/tables")
    public String tables(Model model){
        List<Item> list = new ArrayList<>();
        list.add(new Item(101, "product1",20000,"A.jpg",new Date()));
        list.add(new Item(102, "product2",2000,"B.jpg",new Date()));
        list.add(new Item(103, "product3",3000,"C.jpg",new Date()));
        list.add(new Item(104, "product4 ",4000,"D.jpg",new Date()));
        list.add(new Item(105, "product5",5000,"E.jpg",new Date()));
        list.add(new Item(106, "product6",5000,"E.jpg",new Date()));
        list.add(new Item(107, "product7",5000,"E.jpg",new Date()));
        list.add(new Item(108, "product8",5000,"E.jpg",new Date()));
        list.add(new Item(109, "product9",5000,"E.jpg",new Date()));
        list.add(new Item(110, "product10",5000,"E.jpg",new Date()));
        list.add(new Item(111, "product11",20000,"A.jpg",new Date()));
        list.add(new Item(112, "product12",2000,"B.jpg",new Date()));
        list.add(new Item(113, "product13",3000,"C.jpg",new Date()));
        list.add(new Item(114, "product14 ",4000,"D.jpg",new Date()));
        list.add(new Item(115, "product15",5000,"E.jpg",new Date()));
        list.add(new Item(116, "product16",5000,"E.jpg",new Date()));
        list.add(new Item(117, "product17",5000,"E.jpg",new Date()));
        list.add(new Item(118, "product18",5000,"E.jpg",new Date()));
        list.add(new Item(119, "product19",5000,"E.jpg",new Date()));
        list.add(new Item(120, "product20",5000,"E.jpg",new Date()));
        model.addAttribute("allitem", list);

        model.addAttribute("center","tables");
        return "index";
    }
}
