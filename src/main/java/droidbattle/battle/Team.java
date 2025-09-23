package droidbattle.battle;
import droidbattle.droids.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас, який представляє команду дроїдів
 */
public class Team {

    /** Назва команди */
    private final String name;
    /** Динамічний список учасників команди */
    private ArrayList<Droid> members;

    /**
     * Конструктор команди
     * @param name назва команди
     */
    public Team(String name) {
        this.name = name;
        members = new ArrayList<Droid>();
    }

    /**
     * Додає дроїда до команди
     * @param droid дроїд, якого додають до команди
     */
    public void addDroid(Droid droid) {
        members.add(droid);
    }

    /**
     * Список дроїдів у команді
     * @return учасників команди
     */
    public List<Droid> getMembers() {
        return members;
    }

    /**
     * @return true, якщо є ще живі дроїди
     */
    public boolean isAlive() {
        for (Droid d : members) {
            if (d.isAlive()) return true;
        }
    return false;
    }

    /**
     * Виводить склад команди
     */
    public void showTeam() {
        System.out.println("Команда " + name + " :");
        for(Droid d : members){
            System.out.println("- " + d.getName() + " [HP: " + d.getHealth() + ", DMG: " + d.getDamage() + " ]");
        }
    }

    /**
     * @return повертає ім'я комнди
     */
    public String getName() {return name;}

}
