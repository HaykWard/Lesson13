//абстрактный класс для наследования от него конкретных классов героев
package lesson13.factoryPattern;

public abstract class Heroes {
   public String name;
    int hp;
    int armor;
    int power;
    int speed;

    protected Heroes(String name, int hp, int armor, int power, int speed){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.power = power;
        this.speed = speed;
    }
}
