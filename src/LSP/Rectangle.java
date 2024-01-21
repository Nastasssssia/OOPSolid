package LSP;

/**
 * Класс представляет собой прямоугольник, реализующий интерфейс Shape.
 */
public class Rectangle implements Shape {
    private int width;
    private int height;

    /**
     * Метод для установки ширины прямоугольника.
     *
     * @param width Ширина прямоугольника.
     */
    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Метод для установки высоты прямоугольника.
     *
     * @param height Высота прямоугольника.
     */
    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Метод для вычисления площади прямоугольника.
     *
     * @return Площадь прямоугольника.
     */
    @Override
    public int area() {
        return this.width * this.height;
    }
}
