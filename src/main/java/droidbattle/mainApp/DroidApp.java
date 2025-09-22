package droidbattle.mainApp;
import droidbattle.droids.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Головний клас програми "Битва дроїдів"
 * Дозволяє створювати дроїдів, переглядати список створених дроїдів, запускати бої та зберігати іх у файл
 * @author Taras Trymbulskyi
 */
public class DroidApp {
    /** Сканер для введення даних користувачем */
    private static final Scanner scanner = new Scanner(System.in);
    /** Динамічний список створення дроїдів */
    private static final ArrayList<Droid> droidList = new ArrayList<Droid>();

    /**
     * Точка входу в програму
     * Запускає головне меню
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        while (true) {
            printMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showDroidCreationMenu(); // запускаємо підменю
                    break;
                case 2:
                    showDroidListMenu(); // список дроїдів
                    break;
                case 3:
                    System.out.println("Бій 1 на 1...");
                    break;
                case 4:
                    System.out.println("Бій команда на команду...");
                    break;
                case 5:
                    System.out.println("Запис бою у файл...");
                    break;
                case 6:
                    System.out.println("Відтворення бою з файлу...");
                    break;
                case 0:
                    System.out.println("Вихід з гри...");
                    return; // вихід з main
                default:
                    System.out.println("Невірний вибір, спробуйте ще раз.");
            }
        }
    }

    /**
     * Виводить головне меню гри
     */
    public static void printMainMenu() {
        System.out.println("\n=====================================");
        System.out.println("        ГРА: БИТВА ДРОЇДІВ ");
        System.out.println("=====================================");
        System.out.println("1. Створити дроїда");
        System.out.println("2. Показати список дроїдів");
        System.out.println("3. Бій 1 на 1");
        System.out.println("4. Бій команда на команду");
        System.out.println("5. Записати бій у файл");
        System.out.println("6. Відтворити бій із файлу");
        System.out.println("0. Вихід");
        System.out.println("=====================================");
        System.out.print("Виберіть дію: ");
    }

    /**
     * Виводить меню створення дроїда та додає його у список
     * Користувач вибирає тип дроїда та задає йому ім'я
     */
    public static void showDroidCreationMenu() {
        System.out.println("\n=====================================");
        System.out.println("       СТВОРЕННЯ ДРОЇДА ");
        System.out.println("=====================================");
        System.out.println("1. Штурмовик");
        System.out.println("2. Медик");
        System.out.println("3. Снайпер");
        System.out.println("4. Танк");
        System.out.println("0. Назад");
        System.out.println("=====================================");

        while (true) {
            System.out.print("Ваш вибір: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // заберає Enter

            Droid newDroid = null;
            String name = "";

            switch (choice) {
                case 1:
                    System.out.println("Введіть ім'я дроїда: ");
                    name = scanner.nextLine();
                    newDroid = new Stormtrooper_Droid(name);
                    droidList.add(newDroid);
                    System.out.println("Створено Штурмовика " + name + "!");
                    break;
                case 2:
                    System.out.println("Введіть ім'я дроїда: ");
                    name = scanner.nextLine();
                    newDroid = new Medic_Droid(name);
                    droidList.add(newDroid);
                    System.out.println("Створено Медика " + name +"!");
                    break;
                case 3:
                    System.out.println("Введіть ім'я дроїда: ");
                    name = scanner.nextLine();
                    newDroid = new Sniper_Droid(name);
                    droidList.add(newDroid);
                    System.out.println("Створено Снайпера " + name + "!");
                    break;
                case 4:
                    System.out.println("Введіть ім'я дроїда: ");
                    name = scanner.nextLine();
                    newDroid = new Tank_Droid(name);
                    droidList.add(newDroid);
                    System.out.println("Створено Танк " + name + "!");
                    break;
                case 0:
                    System.out.println("Повертаємось у головне меню...");
                    return; // вихід з підменю
                default:
                    System.out.println("Невірний вибір, спробуйте ще раз.");
            }
        }
    }

    /**
     * Виводить список створених дроїдів та їх характеристики (HP та DMG)
     */
    public static void showDroidListMenu() {
        System.out.println("\n=====================================");
        System.out.println("       СПИСОК ДРОЇДІВ ");
        System.out.println("=====================================");

        if(droidList.isEmpty()) {
            System.out.println("Список порожній!");
        }
        else {
            for(byte i = 0; i < droidList.size(); ++i) {
                Droid d = droidList.get(i);
                System.out.println((i + 1) + ". " + d.getName() +
                        " [HP: " + d.getHealth() + ", DMG: " + d.getDamage() + "]");
            }
        }

    }
}
