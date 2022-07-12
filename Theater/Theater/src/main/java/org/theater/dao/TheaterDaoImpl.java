package org.theater.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.theater.Movie;

import java.util.List;

public class TheaterDaoImpl implements TheaterDao
{

    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { // The JDBC connection comes here through setter injection
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addMovie(Movie movie)
    {
        String sql = "INSERT INTO `shows`(`id`, `name`, `genre`, `time`, `price`) VALUES(?,?,?,?,?)";
        int result = this.jdbcTemplate.update(sql,movie.getMovieId(),movie.getMovieName(),movie.getMovieGenre(),movie.getMovieTime(),movie.getMoviePrice());
        return result;

    }

    @Override
    public int deleteMovie(Movie movie)
    {
        String sql = "DELETE FROM shows WHERE name=?";
        int result = this.jdbcTemplate.update(sql,movie.getMovieName());
        return result;

    }

    @Override
    public int updateMovie(Movie movie,int mid) {
        String sql = "UPDATE shows SET id = ?, name = ?,genre = ?,time = ?,price = ? WHERE id = ?";
        int result = this.jdbcTemplate.update(sql,movie.getMovieId(),movie.getMovieName(),movie.getMovieGenre(),movie.getMovieTime(),movie.getMoviePrice(),mid);
        return result;

    }

    @Override
    public Movie viewMovieDetails(Movie movie)
    {
        String sql = "Select * from shows where id = ?";
        Movie m = (Movie) this.jdbcTemplate.queryForObject(sql,new TheaterMapperImpl(),movie.getMovieId());
        return m;
    }

    @Override
    public List<Movie> viewAllMovieDetails()
    {
        String sql = "Select * from shows";
        List<Movie> m = this.jdbcTemplate.query(sql,new TheaterMapperImpl());
        return m;

    }


}
