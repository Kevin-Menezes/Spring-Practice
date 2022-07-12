package org.theater.dao;

import org.springframework.jdbc.core.RowMapper;
import org.theater.Movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class TheaterMapperImpl implements RowMapper<Movie> {
    @Override
    public Movie mapRow(ResultSet rs, int i) throws SQLException {

        Movie m = new Movie();
        m.setMovieId(rs.getInt(1));
        m.setMovieName(rs.getString(2));
        m.setMovieGenre(rs.getString(3));
        m.setMovieTime(rs.getTimestamp(4).toLocalDateTime());
        m.setMoviePrice(rs.getDouble(5));
        return m;
    }
}
