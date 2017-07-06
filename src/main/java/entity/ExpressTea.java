package entity;

import org.springframework.stereotype.Component;

@Component
public class ExpressTea implements HotDrink{

    @Override
    public void prepareHotDrink() {
        System.out.println("Express Tea prepared");
    }
}
