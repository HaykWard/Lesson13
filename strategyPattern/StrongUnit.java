//Конкретный класс сильного Unit
//Определяем что при создании объекта класса StrongUnit показатели будут от 10 до 20
package lesson13.strategyPattern;

import java.util.Random;

public class StrongUnit implements Power {

    Random random = new Random();

    int id = random.nextInt(10,20);//id нужен для того чтобы имена отличались
    int hp = random.nextInt(10,20);
    int speed = random.nextInt(10,20);
    int power = random.nextInt(10,20);
    int armor = random.nextInt(10,20);

    @Override
    public void PowerMeter() {
        Unit unit = new Unit("Unit"+id, hp, speed, power, armor);
        System.out.println("Создан сильный персонаж с данными: ");
        System.out.println("Имя: Unit"+id +" " + "HP: "+hp+" "+"Speed: "+speed+" "+"Power: "+power+" "+"Armor: "+armor);
    }
}
