package OCP;

/**
 * Класс представляет собой автобус, который является подклассом транспортного средства (Vehicle).
 */
public class Bus extends Vehicle {

    /**
     * Конструктор класса Bus.
     *
     * @param maxSpeed Максимальная скорость автобуса.
     * @param type     Тип автобуса.
     */
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    /**
     * Метод для вычисления разрешенной скорости для автобуса.
     *
     * @return Разрешенная скорость для автобуса.
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}
