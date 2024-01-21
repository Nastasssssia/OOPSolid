package ISP;

/**
 * Класс представляет собой круг, реализующий интерфейс TwoDimensionalShape.
 */
public class Circle implements TwoDimensionalShape {
    private double radius;

    /**
     * Конструктор класса Circle.
     *
     * @param radius Радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Метод для вычисления площади круга.
     *
     * @return Площадь круга.
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
