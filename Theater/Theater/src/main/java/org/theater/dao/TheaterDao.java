package org.theater.dao;

import org.theater.Movie;

import java.util.List;

public interface TheaterDao
{
    public int addMovie(Movie movie);

    public int deleteMovie(Movie movie);

    public int updateMovie(Movie movie,int mid);

    public Movie viewMovieDetails(Movie movie);

    public List<Movie> viewAllMovieDetails();
}
