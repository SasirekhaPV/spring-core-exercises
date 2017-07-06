package entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {

    HotDrink hotDrink;

    public Restaurant() {
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }
    @Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
