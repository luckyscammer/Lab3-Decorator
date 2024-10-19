package work3;

/**
 * The {@link SizeManipulator} class extends {@link GraphicElementDecorator} and adds functionality
 * for manipulating the size of a graphical element.
 * @author Oleksandr "Pliffdax" Stepanov
 */
public class SizeManipulator extends GraphicElementDecorator {
    /**
     * The width of the graphical element.
     */
    private int width;

    /**
     * The height of the graphical element.
     */
    private int height;

    /**
     * Constructs a SizeManipulator with a given graphic element.
     *
     * @param component The graphic element to be manipulated
     */
    public SizeManipulator(GraphicElement component) {
        super(component);
    }

    /**
     * Sets the size of the graphical element.
     *
     * @param width  The new width of the element
     * @param height The new height of the element
     */
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("Size set to width=" + width + ", height=" + height);
    }

    /**
     * Draws the graphical element with the specified size.
     * This method delegates drawing to the wrapped component.
     */
    @Override
    public void draw() {
        super.draw();
    }
}