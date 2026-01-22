package com.example.mycollections.controllers;

import com.example.mycollections.models.Book;
import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final List<Movie> movies = new ArrayList<>() {{
        add(new Movie("The Matrix", 1999, "Wachowski Sisters", 136));
        add(new Movie("Inception", 2010, "Christopher Nolan", 148));
        add(new Movie("Interstellar", 2014, "Christopher Nolan", 169));
    }};

    @GetMapping("/json")
    public List<Movie> getMoviesJson() {
        return movies;
    }

    @GetMapping("/html")
    public String getMoviesHtml() {
        String movieList = "<ul>";
        for (Movie movie : movies) {
            movieList += "<li>" + movie + "</li>";
        }
        movieList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Movies</h1>
                        <ul>
                """ +
                movieList +
                """
                                </ul>
                            </body>
                        """;
    }

}