package DIP;

/**
 * Класс представляет собой бензиновый двигатель, реализующий интерфейс Engine.
 */
public class PetrolEngine implements Engine{

    /**
     * Метод для запуска бензинового двигателя.
     * Выводит сообщение "Бензиновый двигатель запущен."
     */
    @Override
    public void start() {
        System.out.println("Бензиновый двигатель запущен.");
    }
}
