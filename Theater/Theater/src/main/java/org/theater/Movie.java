package org.theater;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movie
{
    private int movieId;
    private String movieName;
    private String movieGenre;
    private LocalDateTime movieTime;
    private double moviePrice;

    public Movie() {
    }

    public Movie(int movieId, String movieName, String movieGenre, LocalDateTime movieTime, double moviePrice) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.movieTime = movieTime;
        this.moviePrice = moviePrice;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public LocalDateTime getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(LocalDateTime movieTime) {
        this.movieTime = movieTime;
    }

    public double getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(double moviePrice) {
        this.moviePrice = moviePrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieGenre='" + movieGenre + '\'' +
                ", movieTime=" + movieTime +
                ", moviePrice=" + moviePrice +
                '}';
    }
}
