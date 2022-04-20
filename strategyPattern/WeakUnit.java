//Конкретный класс сильного Unit
//Определяем что при создании объекта класса WeakUnit показатели будут от 1 до 10
package lesson13.strategyPattern;

import java.util.Random;

public class WeakUnit implements Power {

    Random random = new Random();
    int id = random.nextInt(1,10);//id нужен для того чтобы имена отличались
    int hp = random.nextInt(1,10);
    int speed = random.nextInt(1,10);
    int power = random.nextInt(1,10);
    int armor = random.nextInt(1,10);

    @Override
    public void PowerMeter() {
        Unit unit = new Unit("Unit"+id, hp, speed, power, armor);
        System.out.println("Создан слабый персонаж с данными: ");
        System.out.println("Имя: Unit"+id +" " + "HP: "+hp+" "+"Speed: "+speed+" "+"Power: "+power+" "+"Armor: "+armor);
    }
}
