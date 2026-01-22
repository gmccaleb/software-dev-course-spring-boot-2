package com.example.mycollections.controllers;

import com.example.mycollections.models.Album;
import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    private final List<Album> albums = new ArrayList<>(){{
        add(new Album("Thriller", 1982, "Michael Jackson", 9));
        add(new Album("Back in Black", 1980, "AC/DC", 10));
        add(new Album("Rumors", 1977, "Fleetwood Mac", 11));

    }};

    @GetMapping("/json")
    public List<Album> getAlbumsJson(){
        return albums;
    }

    @GetMapping("/html")
    public String getAlbumsHtml() {
        String albumList = "<ul>";
        for (Album album : albums) {
            albumList += "<li>" + album + "</li>";
        }
        albumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Albums</h1>
                        <ul>
                """ +
                albumList +
                """
                                </ul>
                            </body>
                        """;
    }

}
