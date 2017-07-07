package mypack;

import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");

        //Solution 2
        Database db=context.getBean("database", Database.class);
        System.out.println("\nSol2 :Displaying instance variables of Database object:");
        System.out.println(db.getName());
        System.out.println(db.getPort());

        //Solution 3
        Restaurant teaRestaurant= context.getBean("teaRestaurant",Restaurant.class);
        System.out.println("\nSol3");
        teaRestaurant.getHotDrink().prepareHotDrink();

        //Solution 4
        System.out.println("\nSol4");
        HotDrink hotDrink=context.getBean("tea",Tea.class);
        hotDrink.prepareHotDrink();
        HotDrink hotDrink1=context.getBean("expressTea", ExpressTea.class);
        hotDrink1.prepareHotDrink();

        //Solution 4- 2nd part
        System.out.println("\nSol4- 2nd part");
        Restaurant expressTeaRestaurant=context.getBean("expressTeaRestaurant",Restaurant.class);
        expressTeaRestaurant.getHotDrink().prepareHotDrink();

        //Solution 5
        System.out.println("\nSol5");
        Complex complex=context.getBean("complexBean",Complex.class);

        List list=complex.getList();
        list.forEach(System.out::println);

        Set set=complex.getSet();
        set.forEach(System.out::println);

        Map<String,String> map=(Map<String,String>)complex.getMap();
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}