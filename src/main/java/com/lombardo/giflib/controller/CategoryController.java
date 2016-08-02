package com.lombardo.giflib.controller;


import com.lombardo.giflib.data.CategoryRepo;
import com.lombardo.giflib.data.GifRepo;
import com.lombardo.giflib.model.Category;
import com.lombardo.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepo catRepo;

    @Autowired
    private GifRepo gifRepo;

    @RequestMapping(value = "/categories")
    public String listCategories(ModelMap modelMap) {
        List<Category> catList = catRepo.getAllCategories();
        modelMap.put("categories", catList);
        return "categories";
    }

    @RequestMapping(value = "/category/{catID}")
    public String categoryDetails(@PathVariable int catID, ModelMap modelMap) {
        Category category = catRepo.findById(catID);
        System.out.println(category);
        modelMap.put("category", category);

        List<Gif> gifs = gifRepo.findByCategoryId(catID);
        modelMap.put("gifs", gifs);
        return "category";
    }
}
