package droidbattle.droids;
import java.util.Scanner;

/**
 * Клас Stormtrooper_Droid — дроїд-штурмовик.
 * Має середній рівень здоров'я і збалансований урон.
 * Додаткова здібність: режим берсерка (+20% до атаки, але отримує +20% шкоди).
 */
public class Stormtrooper_Droid extends Droid {

    Scanner scanner = new Scanner(System.in);
    private boolean berserkActivated = false;
    private boolean berserkActiveNow = false;

    private double attackMultiplier = 1.0;
    private double damageMultiplier = 1.0;
    /**
     * Конструктор штурмовика.
     *
     * @param name ім'я дроїда
     */
    public Stormtrooper_Droid(String name) {
        super(name, 105, 25);
    }

    @Override
    public void action(Droid target) {
        System.out.println("\nВиберіть дію для штурмовика " + name + ":\n1. Аттака\t");


    }

    /**
     * Атака штурмовика на цільовий дроїд.
     *
     * @param target дроїд, якого атакують
     */
    @Override
    public void attack(Droid target) {
        System.out.println("- Штурмовик " + name + " атакує " + target.getName() + " на " +
                (damage * attackMultiplier) + " урону" + "!");
        target.takeDamage( (int)(damage * attackMultiplier));
    }

    @Override
    public void takeDamage(int damage) {
        health -= (int)(damage * damageMultiplier);
        if(health < 0) health = 0;

        System.out.println("- Дроїд " + name + " отримав " +
                (damage * damageMultiplier) + " урону! [HP: " + health + " ]");
    }
}
