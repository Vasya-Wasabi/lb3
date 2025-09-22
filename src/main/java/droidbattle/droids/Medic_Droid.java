package droidbattle.droids;

/**
 * Клас Medic_Droid — дроїд-медик.
 * Може атакувати ворогів і відновлювати своє здоров'я.
 */
public class Medic_Droid extends Droid {

    /** Максимальний рівень здоров'я медика */
    private int maxHealth;

    /**
     * Конструктор медика.
     *
     * @param name ім'я медика
     */
    public Medic_Droid(String name) {
        super(name, 80, 10);
        maxHealth = 80;
    }

    /**
     * Відновлює здоров'я медика на задану кількість HP.
     * Якщо здоров'я перевищує максимальне — встановлює його у maxHealth.
     *
     * @param amount кількість HP для відновлення
     */
    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) health = maxHealth;
    }

    /**
     * Атака медика на цільовий дроїд.
     * Може випадково (30% шанс) відновити собі 10 HP під час атаки.
     *
     * @param target дроїд, якого атакують
     */
    @Override
    public void attack(Droid target) {
        System.out.println("Медик " + name + " атакує " + target.getName() + " на " + damage + "урона" + "!");
        target.takeDamage(damage);

        double chance = Math.random();
        if(chance < 0.30) {
            heal(10);
            System.out.println("Медик " + name + " відновив собі 10 HP!");
        }
    }

    /**
     * Активне лікування медика — відновлює 25 HP.
     */
    public void activeHeal() {
        heal(25);
        System.out.println("Медик " + name + " відновив собі 25 HP!");

    }
}
