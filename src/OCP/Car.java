package OCP;

/**
 * Класс представляет собой автомобиль, который является подклассом транспортного средства (Vehicle).
 */
public class Car extends Vehicle {

    /**
     * Конструктор класса Car.
     *
     * @param maxSpeed Максимальная скорость автомобиля.
     * @param type     Тип автомобиля.
     */
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    /**
     * Метод для вычисления разрешенной скорости для автомобиля.
     *
     * @return Разрешенная скорость для автомобиля.
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}
