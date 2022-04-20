package lesson13.factoryPattern.heroes;

import lesson13.factoryPattern.Heroes;

public class Orc extends Heroes {

    int boom;
    public Orc(String name, int hp, int armor, int power, int speed, int boom) {
        super(name, hp, armor, power, speed);
        this.boom = boom;
    }
}
