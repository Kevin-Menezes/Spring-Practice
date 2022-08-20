package org.icecream.dao;

import org.icecream.entities.Icecream;
import org.springframework.jdbc.core.JdbcTemplate;

import java.awt.datatransfer.StringSelection;
import java.util.List;

public class IcecreamDAOImpl implements IcecreamDAO{

    public JdbcTemplate jdbctemplate;

    public void setJdbcTemplate(JdbcTemplate jdbctemplate){
        this.jdbctemplate = jdbctemplate;
    }

    @Override
    public int addIcecream(Icecream ice) {

        String sql = "INSERT INTO stock VALUES(?,?,?,?)";
        int result = this.jdbctemplate.update(sql,ice.getId(),ice.getName(),ice.getCategory(),ice.getPrice());
        return result;
    }

    @Override
    public int removeIcecream(String name) {

        String sql = "DELETE FROM stock WHERE name=?";
        return this.jdbctemplate.update(sql,name);
    }

    @Override
    public int replaceIcecream(Icecream ice,String name) {

        String sql = "UPDATE stock SET name=?,category=?,price=? WHERE name=?";
        return this.jdbctemplate.update(sql,ice.getName(),ice.getCategory(),ice.getPrice(),name);
    }

    @Override
    public List<Icecream> showMenu() {

        String sql = "SELECT * FROM stock";
        List<Icecream> i = this.jdbctemplate.query(sql,new IcecreamMapperImpl());
        return i;
    }

    @Override
    public Icecream buyIcecream(String name) {

        String sql = "SELECT * FROM stock WHERE name=?";
        Icecream icecream = this.jdbctemplate.queryForObject(sql,new IcecreamMapperImpl(),name);
        return icecream;
    }
}
