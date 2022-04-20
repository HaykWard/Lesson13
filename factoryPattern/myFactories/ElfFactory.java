//Фабрика создания елфов, по конструктору от класса Elf
package lesson13.factoryPattern.myFactories;

import lesson13.factoryPattern.Factory;
import lesson13.factoryPattern.heroes.Elf;


import java.util.Random;

public class ElfFactory implements Factory {

        Random random = new Random();
        int ElfID = random.nextInt(10);
        int ElfHp = random.nextInt(80,100);
        int ElfArmor = random.nextInt(20);
        int ElfPower = random.nextInt(5,15);
        int ElfSpeed = random.nextInt(15,20);
        int ElfFlySpeed = random.nextInt(50,100);
        @Override
        public void makeHeroes() {
            Elf elf = new Elf("Elf"+ElfID, ElfHp, ElfArmor, ElfPower, ElfSpeed, ElfFlySpeed);
            System.out.println("Создан персонаж представителей Елфов!");
            System.out.println("Имя: "+elf.name + " HP: "+ElfHp + " Armor:"+ElfArmor+ " Power: "+ElfPower+ " Speed: "+ElfSpeed+ " FlySpeed: "+ElfFlySpeed);
        }
    }
