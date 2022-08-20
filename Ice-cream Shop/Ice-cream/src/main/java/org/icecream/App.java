package org.icecream;

import org.icecream.dao.IcecreamDAO;
import org.icecream.dao.IcecreamDAOImpl;
import org.icecream.entities.Icecream;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {

    // Enum is a class with variables that are fixed
    enum category {Chocolate,Fruit,Nutty}

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        IcecreamDAO icecreamDAO = (IcecreamDAOImpl) context.getBean("IcecreamImpl");
        Icecream ice = context.getBean("Ice",Icecream.class);

        // Insert
//        ice.setName("Almond");
//        ice.setCategory(String.valueOf(category.Nutty));
//        ice.setPrice(80F);
//        int res = icecreamDAO.addIcecream(ice);
//        if(res>=1){
//            System.out.println(ice.getName()+" icecream available in shop!");
//        }
//        else{
//            System.out.println("Error in adding icecream!");
//        }

        // Delete
//        int res = icecreamDAO.removeIcecream("Almond");
//        if(res>=1){
//            System.out.println("Almond icecream unavailable in shop!");
//        }
//        else{
//            System.out.println("Error in removing icecream!");
//        }


        // Update
//        ice.setName("Double");
//        ice.setCategory(String.valueOf(category.Chocolate));
//        ice.setPrice(65F);
//        int res = icecreamDAO.replaceIcecream(ice,"Triple");
//        if(res>=1){
//            System.out.println("Triple icecream is replaced to "+ice.getName()+" in the shop!");
//        }
//        else{
//            System.out.println("Error in replacing icecream!");
//        }

        // Display all icecreams
        List<Icecream> list = icecreamDAO.showMenu();
        for(Icecream i:list){
            System.out.println(i.getName());
        }

        // Buy 1 icecream
        Icecream icecream = icecreamDAO.buyIcecream("Mango");
        System.out.println("Enjoy! "+icecream);

    }
}
