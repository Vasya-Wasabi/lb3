package droidbattle.droids;

/**
 * Клас Tank_Droid — дроїд-танк.
 * Має високий рівень здоров'я і помірний урон.
 * Особливість: 40% шанс отримати лише половину урону при атаці.
 */
public class Tank_Droid extends Droid {

    /**
     * Конструктор танка.
     *
     * @param name ім'я дроїда
     */
    public Tank_Droid(String name) {
        super(name, 150, 15);
    }

    /**
     * Атака танка на цільовий дроїд.
     *
     * @param target дроїд, якого атакують
     */

    @Override
    public void action(Droid target) {}

    @Override
    public void attack(Droid target){
        System.out.println("Танк " + name + " атакує " + target.getName() + " на " + damage + " урона" + "!");
        target.takeDamage(damage);
    }

    /**
     * Обробка отримання урону танком.
     * Є 40% шанс отримати лише половину урону.
     *
     * @param damage кількість отриманого урону
     */
    @Override
    public void takeDamage(int damage) {
        double chance = Math.random();
        if(chance < 0.40) {
            System.out.println("Спрацював щит!");
            health -= (damage / 2);
            if(health < 0) health = 0;
        } else {
            health -= damage;
            if(health < 0) health = 0;
        }
    }

}
