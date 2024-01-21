package DIP;

/**
 * Класс представляет собой дизельный двигатель, реализующий интерфейс Engine.
 */
public class DieselEngine implements Engine{

    /**
     * Метод для запуска дизельного двигателя.
     * Выводит сообщение "Дизельный двигатель запущен."
     */
    @Override
    public void start() {
        System.out.println("Дизельный двигатель запущен.");
    }
}
