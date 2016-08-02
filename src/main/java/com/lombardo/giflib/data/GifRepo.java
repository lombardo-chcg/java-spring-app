package com.lombardo.giflib.data;

import com.lombardo.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepo {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", 1, LocalDate.of(2015,2,13), "Bob", false),
            new Gif("ben-and-mike", 2,  LocalDate.of(2015,10,30), "Bob Two", true),
            new Gif("book-dominos", 3, LocalDate.of(2015,9,15), "Bob Three", false),
            new Gif("compiler-bot", 1, LocalDate.of(2015,2,13), "Bob Four", true),
            new Gif("cowboy-coder", 3, LocalDate.of(2015,2,13), "Bob Five", false),
            new Gif("infinite-andrew", 2, LocalDate.of(2015,8,23), "Bob Six", true)
    );

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> findByCategoryId(int catID) {
        List<Gif> gifList = new ArrayList();
        for (Gif gif : ALL_GIFS) {
            if (gif.getCategoryID() == catID) {
                gifList.add(gif);
            }
        }
        return gifList;
    }
}
