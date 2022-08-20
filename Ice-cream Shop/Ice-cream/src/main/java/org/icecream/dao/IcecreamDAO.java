package org.icecream.dao;

import org.icecream.entities.Icecream;

import java.util.List;

public interface IcecreamDAO {

    public int addIcecream(Icecream icecream);

    public int removeIcecream(String name);

    public int replaceIcecream(Icecream icecream,String name);

    public List<Icecream> showMenu();

    public Icecream buyIcecream(String name);


}
