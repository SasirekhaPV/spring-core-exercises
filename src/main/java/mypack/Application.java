package mypack;

import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");

        //Solution 6
        System.out.println("Solution 6");
        Restaurant restaurant1=context.getBean("restaurant1",Restaurant.class);
        // Restaurant restaurant2=context.getBean("restaurant2",Restaurant.class);
        Restaurant restaurant3=context.getBean("restaurant3",Restaurant.class);

        restaurant1.getHotDrink().prepareHotDrink();
        //restaurant2.getHotDrink().prepareHotDrink();
        restaurant3.getHotDrink().prepareHotDrink();

        //Solution 7
        System.out.println("\nSolution 7");
        Restaurant teaRestaurant=context.getBean("teaRestaurant",Restaurant.class);

        //hot drind of teaRestaurant changed
        teaRestaurant.setHotDrink(new ExpressTea());
        teaRestaurant.getHotDrink().prepareHotDrink();

        //another instance of teaRestaurant created using getBean
        Restaurant teaRestaurant1=context.getBean("teaRestaurant",Restaurant.class);
        teaRestaurant1.getHotDrink().prepareHotDrink();

    }
}