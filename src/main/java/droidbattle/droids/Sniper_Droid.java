package droidbattle.droids;

/**
 * Клас Sniper_Droid — дроїд-снайпер.
 * Має високу атаку, але низький рівень здоров'я.
 * Може завдавати критичний урон з певним шансом.
 */
public class Sniper_Droid extends Droid {

    /**
     * Конструктор снайпера.
     *
     * @param name ім'я дроїда
     */
    public Sniper_Droid(String name) {
        super(name, 65, 30);
    }

    /**
     * Атака снайпера на цільовий дроїд.
     * Існує 35% шанс завдати критичний урон (подвоєний damage).
     *
     * @param target дроїд, якого атакують
     */

    @Override
    public void action(Droid target) {}

    @Override
    public void attack(Droid target){
        double chance = Math.random();
        if(chance < 0.35) {
            System.out.println("Снайпер " + name + " атакує критичним уроном " + target.getName() + " на " + (damage * 2) + "урона" + "!");
            target.takeDamage(damage * 2);
        } else {
            System.out.println("Снайпер " + name + " атакує " + target.getName() + " на " + damage + " урона" + "!");
            target.takeDamage(damage);
        }
    }
}
