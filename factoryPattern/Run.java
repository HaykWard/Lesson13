package lesson13.factoryPattern;

import lesson13.factoryPattern.myFactories.ElfFactory;
import lesson13.factoryPattern.myFactories.HumanFactory;
import lesson13.factoryPattern.myFactories.OrcFactory;

public class Run {
    public static void main(String[] args) {
        HumanFactory hf = new HumanFactory();
        OrcFactory of = new OrcFactory();
        ElfFactory ef = new ElfFactory();

        hf.makeHeroes();
        System.out.println();
        of.makeHeroes();
        System.out.println();
        ef.makeHeroes();
    }
}
