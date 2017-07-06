package mypack;

import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");

        //Solution 10
        System.out.println("Solution 10");
        //Trying @Configuration, @Autowired, @Qualifier
        Restaurant restaurant=context.getBean("restaurant",Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();

        //trying @Component
        ExpressTea expressTea=context.getBean("expressTea",ExpressTea.class);
        expressTea.prepareHotDrink();

        //similarty @Controller is used to make bean of the class which handles request mapping
        //@Repository for class which deals with database persistence
        //@Service for class holding bussiness login (service layer)git
    }
}