package DIP;

/**
 * Класс представляет собой автомобиль, который зависит от двигателя.
 * Реализует принцип инверсии зависимостей (Dependency Inversion Principle).
 */
public class Car {
    private Engine engine;

    /**
     * Конструктор класса Car.
     *
     * @param engine Объект, реализующий интерфейс Engine, представляющий двигатель автомобиля.
     */
    public Car(Engine engine) {
        this.engine = engine;
    }

    /**
     * Метод для запуска автомобиля.
     * Вызывает метод start() у зависимого двигателя.
     */
    public void start() {
        this.engine.start();
    }
}
