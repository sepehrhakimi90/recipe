package com.fahsep.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by esephak on 4/8/2018.
 */
@Controller
public class IndexController{

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }
}
