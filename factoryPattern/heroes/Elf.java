package lesson13.factoryPattern.heroes;

import lesson13.factoryPattern.Heroes;

public class Elf extends Heroes {

    int flySpeed;
    public Elf(String name, int hp, int armor, int power, int speed, int flySpeed) {
        super(name, hp, armor, power, speed);
        this.flySpeed = flySpeed;
    }
}
