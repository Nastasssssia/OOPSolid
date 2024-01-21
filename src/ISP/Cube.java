package ISP;

/**
 * Класс представляет собой куб, реализующий интерфейс ThreeDimensionalShape.
 */
public class Cube implements ThreeDimensionalShape {
    private int edge;

    /**
     * Конструктор класса Cube.
     *
     * @param edge Длина ребра куба.
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Метод для вычисления площади поверхности куба.
     *
     * @return Площадь поверхности куба.
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /**
     * Метод для вычисления объема куба.
     *
     * @return Объем куба.
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}




