package lesson13.factoryPattern.heroes;

import lesson13.factoryPattern.Heroes;

public class Human extends Heroes {

    int iq;
    public Human(String name, int hp, int armor, int power, int speed, int iq) {
        super(name, hp, armor, power, speed);
        this.iq = iq;
    }
}
