package LSP;

/**
 * Класс представляет собой квадрат, реализующий интерфейс Shape.
 */
public class Squre implements Shape{
    private int side;

    /**
     * Метод для установки ширины квадрата (одновременно и высоты, так как квадрат).
     *
     * @param width Ширина квадрата.
     */
    @Override
    public void setWidth(int width) {
        this.side = width;
    }

    /**
     * Метод для установки высоты квадрата (одновременно и ширины, так как квадрат).
     *
     * @param height Высота квадрата.
     */
    @Override
    public void setHeight(int height) {
        this.side = height;
    }
    /**
     * Метод для вычисления площади квадрата.
     *
     * @return Площадь квадрата.
     */
    @Override
    public int area() {
        return this.side * this.side;
    }
}
