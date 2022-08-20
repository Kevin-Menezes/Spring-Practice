package org.icecream.dao;

import org.icecream.entities.Icecream;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IcecreamMapperImpl implements RowMapper<Icecream> {

    public Icecream mapRow(ResultSet rs, int id) throws SQLException {

        Icecream ice = new Icecream();
        ice.setId(rs.getInt(1));
        ice.setName(rs.getString(2));
        ice.setCategory(rs.getString(3));
        ice.setPrice(rs.getFloat(4));

        return ice;

    }

}
