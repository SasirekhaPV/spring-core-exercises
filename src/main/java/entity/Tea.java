package entity;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Tea implements HotDrink {

    @Override
    public void prepareHotDrink() {
        System.out.println("Tea prepared");
    }
}
