package mypack;

import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        //this will throw exception because hotDrink is required
        try{
            ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
            context.getBean("restaurant",Restaurant.class);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}