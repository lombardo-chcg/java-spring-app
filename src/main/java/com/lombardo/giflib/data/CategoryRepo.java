package com.lombardo.giflib.data;

import com.lombardo.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepo {

    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(3, "adorbs"),
            new Category(2, "clever"),
            new Category(1, "funny")
    );


    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for (Category c : ALL_CATEGORIES) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
