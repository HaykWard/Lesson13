package lesson13.strategyPattern;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
       choosePower();

    }

    static void choosePower(){
        System.out.println("Выберите героя: 1-сильный, 2-слабый");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1){
            strong();
        }
        if (number == 2){
            weak();
        }
        else {
            System.out.println("Введите 1 или 2");
        }
    }

    static void strong(){
        StrongUnit unit = new StrongUnit();
        unit.PowerMeter();
    }

    static void weak(){
        WeakUnit unit = new WeakUnit();
        unit.PowerMeter();
    }

}
