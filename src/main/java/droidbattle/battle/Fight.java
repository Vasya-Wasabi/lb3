package droidbattle.battle;
import droidbattle.droids.*;

public class Fight {

    public static void duel(Droid d1, Droid d2) {
        System.out.println("\n=====================================");
        System.out.println("       БІЙ 1 НА 1 ");
        System.out.println("=====================================");
        System.out.println(d1.getName() + " VS " + d2.getName());

        Droid firstAttacker;
        Droid secondAttacker;

        if(Math.random() < 0.5) {
            firstAttacker = d1;
            secondAttacker = d2;
        } else {
            firstAttacker = d2;
            secondAttacker = d1;
        }

        System.out.println("Першим атакує " + firstAttacker.getName());

        while(d1.isAlive() && d2.isAlive()) {
            firstAttacker.action(secondAttacker);

            if(!secondAttacker.isAlive()) {
                System.out.println(secondAttacker.getName() + " загинув!");
                break;
            }

            secondAttacker.action(firstAttacker);

            System.out.println("\nІнформація про дроїдів після бою:");
            System.out.println(firstAttacker);
            System.out.println(secondAttacker + "\n");

            if(!firstAttacker.isAlive()) {
                System.out.println(firstAttacker.getName() + " загинув!");
                break;
            }
        }

        if(d1.isAlive()) {System.out.println("Дроїд " + d1.getName() + " переміг!");}
        else {System.out.println("Дроїд " + d2.getName() + " переміг!");}
    }
}
