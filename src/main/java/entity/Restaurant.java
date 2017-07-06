package entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {

    HotDrink hotDrink;

    public Restaurant() {
    }

    @Autowired
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }
}
