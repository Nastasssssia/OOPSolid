package OCP;

/**
 * Класс представляет собой транспортное средство.
 */
public class Vehicle {
    int maxSpeed;
    String type;

    /**
     * Конструктор класса Vehicle.
     *
     * @param maxSpeed Максимальная скорость транспортного средства.
     * @param type     Тип транспортного средства.
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    /**
     * Метод для получения максимальной скорости транспортного средства.
     *
     * @return Максимальная скорость транспортного средства.
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Метод для получения типа транспортного средства.
     *
     * @return Тип транспортного средства.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Метод для вычисления разрешенной скорости транспортного средства.
     *
     * @return Разрешенная скорость транспортного средства.
     */
    public double calculateAllowedSpeed() {
        return 0.0; // Default implementation, can be overridden by subclasses
    }
}
