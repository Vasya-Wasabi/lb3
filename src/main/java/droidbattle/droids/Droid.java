package droidbattle.droids;

/**
 * Абстрактний клас для всіх інших дроїдів
 * Визначає спільні методи та характеристики:
 * ім'я, здоров'я, урон, базові дії (атака, отримання урона, перевірка життя)
 */
public abstract class Droid {
    /** Ім'я дроїда */
    protected String name;
    /** Поточний рівень здоров'я (HP)  */
    protected int health;
    /** Базовий урон (DMG) */
    protected int damage;

    /**
     * Конструктор дроїда
     * @param name ім'я дроїда
     * @param health поточний рівень здоров'я
     * @param damage базовий урон
     */
    public Droid(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    /**
     * Абстрактний метод атаки (повинен бути реалізований в кожному підкласі (спадкоємцю))
     *
     * @param target дроїд (ціль) якого атакують
     */
    public abstract void attack(Droid target);

    /**
     * Метон отримання урону
     *
     * @param damage величинна отриманого урону
     */
    public void takeDamage(int damage) {
        health -= damage;
        if(health < 0) health = 0;
    }

    /**
     * Перевіряє чи живий ще дроїд
     *
     * @return true, якщо HP > 0, інакше false
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * Гетер для імені дроїда
     *
     * @return ім'я дроїда
     */
    public String getName() {return name;}

    /**
     * Гетер поточного здоров'я дроїда
     *
     * @return поточне здоров'я дроїда
     */
    public int getHealth() {return health;}

    /**
     * Гетер велечини урона дроїді
     *
     * @return величину урону
     */
    public int getDamage() {return damage;}

    /**
     * Метод для отримання інформації про дроїда
     *
     * @return ім'я + здоров'я + урон
     */
    public String toString() {
        return name + "[HP: " + health + ", Damage: " + damage + "]";
    }
}
