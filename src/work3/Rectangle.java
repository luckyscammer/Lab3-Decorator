package work3;

/**
 * The {@link Rectangle} class implements the {@link GraphicElement} interface.
 * It represents a simple rectangular shape in the graphic editor.
 * @author Oleksandr "Pliffdax" Stepanov
 */
public class Rectangle implements GraphicElement {

    /**
     * Draws a rectangle. This method overrides the draw method from the {@link GraphicElement} interface
     * and outputs a message indicating that a rectangle is being drawn.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}
