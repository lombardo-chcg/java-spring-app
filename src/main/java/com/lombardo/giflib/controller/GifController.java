package com.lombardo.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @RequestMapping(value = "/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping(value = "/gif")
    @ResponseBody
    public String singleGif() {
        return "Gif FUUUUUUK, brah";
    }
}
