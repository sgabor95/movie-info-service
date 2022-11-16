package io.javabrain.movieinfoservice.resource;

import io.javabrain.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class MovieResource
{
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String id)
	{
		return new Movie(id, "The Avengers");
	}
}
