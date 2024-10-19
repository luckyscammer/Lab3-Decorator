package work3;

/**
 * The {@link GraphicElementDecorator} class is an abstract decorator for graphic elements.
 * It allows additional functionality to be added to graphical elements dynamically
 * without altering their structure.
 * @author Oleksandr "Pliffdax" Stepanov
 */
public abstract class GraphicElementDecorator implements GraphicElement {
    /**
     * The graphic element that is being decorated.
     * This component represents the original graphic element to which
     * additional functionalities (like size or position adjustments) are added.
     */
    protected GraphicElement component;

    /**
     * Constructs a {@link GraphicElementDecorator} with a given graphic element.
     *
     * @param component The graphic element to be decorated
     */
    public GraphicElementDecorator(GraphicElement component) {
        this.component = component;
    }

    /**
     * Draws the decorated graphic element. This method delegates the drawing operation
     * to the wrapped component.
     */
    @Override
    public void draw() {
        component.draw();
    }
}
