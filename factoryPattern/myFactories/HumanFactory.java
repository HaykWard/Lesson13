//Фабрика создания людей, по конструктору от класса Human

package lesson13.factoryPattern.myFactories;

import lesson13.factoryPattern.Factory;
import lesson13.factoryPattern.heroes.Human;

import java.util.Random;

public class HumanFactory implements Factory {

    Random random = new Random();
    int HumanID = random.nextInt(10);
    int HumanHp = random.nextInt(80,100);
    int HumanArmor = random.nextInt(20);
    int HumanPower = random.nextInt(5,15);
    int HumanSpeed = random.nextInt(15,20);
    int HumanIq = random.nextInt(50,100);
    @Override
    public void makeHeroes() {
        Human human = new Human("Human"+HumanID, HumanHp, HumanArmor, HumanPower, HumanSpeed, HumanIq);
        System.out.println("Создан персонаж человека!");
        System.out.println("Имя: "+human.name + " HP: "+HumanHp + " Armor:"+HumanArmor+ " Power: "+HumanPower+ " Speed: "+HumanSpeed+ " IQ: "+HumanIq);
    }
}
