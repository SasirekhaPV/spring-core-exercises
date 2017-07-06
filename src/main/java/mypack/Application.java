package mypack;

import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");

        //Solution 9a (@Autowire using field)
        System.out.println("Solution 9a");
        Restaurant restaurant=context.getBean("restaurant",Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
    }
}