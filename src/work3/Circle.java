package work3;

/**
 * The {@link Circle} class implements the GraphicElement interface.
 * It represents a simple circular shape in the graphic editor.
 * @author Oleksandr "Pliffdax" Stepanov
 */
public class Circle implements GraphicElement {

    /**
     * Draws a circle. This method overrides the draw method from the {@link GraphicElement} interface
     * and outputs a message indicating that a circle is being drawn.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}
