package io.javabrain.movieinfoservice.model;

public class Movie
{
	private String movieId;
	private String name;

	public Movie(String id, String name)
	{
		this.movieId = id;
		this.name = name;
	}

	public String getMovieId()
	{
		return movieId;
	}

	public void setMovieId(String movieId)
	{
		this.movieId = movieId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
