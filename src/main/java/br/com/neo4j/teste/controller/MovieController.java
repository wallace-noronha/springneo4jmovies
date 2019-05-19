package br.com.neo4j.teste.controller;


import br.com.neo4j.teste.model.Movie;
import br.com.neo4j.teste.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("movie")
    public Movie findByTitle(@RequestParam String title){
        return movieService.findByTitle(title);
    }

    @GetMapping("movies")
    public Collection<Movie> findByTitleLike(@RequestParam String title){
        return movieService.findByTitleLike(title);
    }

    @GetMapping("graphs")
    public Map<String , Object> graph(@RequestParam(value = "limit", required = false) Integer limit){
        return movieService.graph(limit == null ? 100 : limit);
    }

}