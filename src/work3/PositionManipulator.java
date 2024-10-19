package work3;

/**
 * The {@link PositionManipulator} class extends {@link GraphicElementDecorator} and adds functionality
 * for manipulating the position of a graphical element.
 * @author Oleksandr "Pliffdax" Stepanov
 */
public class PositionManipulator extends GraphicElementDecorator {
    /**
     * The x-coordinate representing the horizontal position of the graphical element.
     */
    private int x;

    /**
     * The y-coordinate representing the vertical position of the graphical element.
     */
    private int y;
    /**
     * Constructs a PositionManipulator with a given graphic element.
     *
     * @param component The graphic element to be manipulated
     */
    public PositionManipulator(GraphicElement component) {
        super(component);
    }

    /**
     * Sets the position of the graphical element.
     *
     * @param x The new x-coordinate
     * @param y The new y-coordinate
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Position set to x=" + x + ", y=" + y);
    }

    /**
     * Draws the graphical element at the specified position.
     * This method delegates drawing to the wrapped component.
     */
    @Override
    public void draw() {
        super.draw();
    }
}
