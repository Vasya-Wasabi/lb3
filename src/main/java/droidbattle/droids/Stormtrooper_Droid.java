package droidbattle.droids;

/**
 * Клас Stormtrooper_Droid — дроїд-штурмовик.
 * Має середній рівень здоров'я і збалансований урон.
 * Призначений для прямих атак на ворога.
 */
public class Stormtrooper_Droid extends Droid {

    /**
     * Конструктор штурмовика.
     *
     * @param name ім'я дроїда
     */
    public Stormtrooper_Droid(String name) {
        super(name, 105, 25);
    }

    /**
     * Атака штурмовика на цільовий дроїд.
     *
     * @param target дроїд, якого атакують
     */
    @Override
    public void attack(Droid target) {
        System.out.println("Штурмовик " + name + " атакує " + target.getName() + " на " + damage + "урону" + "!");
        target.takeDamage(damage);
    }


}
