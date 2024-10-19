import work3.*;

/**
 * The {@link Main} class demonstrates the functionality of manipulating graphical elements
 * (such as rectangles and circles) using decorators for position and size modifications.
 * It creates different graphical elements and applies transformations to them.
 * @author Oleksandr "Pliffdax" Stepanov
 */
public class Main {
    /**
     * The main method is the entry point of the program. It creates and manipulates
     * graphical elements by adjusting their position and size, then drawing them.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        GraphicElement rectangle = new Rectangle();
        GraphicElement replaceableRectangle = new PositionManipulator(rectangle);
        ((PositionManipulator) replaceableRectangle).setPosition(41, 52);
        GraphicElement sizeableRectangle = new SizeManipulator(replaceableRectangle);
        ((SizeManipulator) sizeableRectangle).setSize(10, 25);
        sizeableRectangle.draw();
        System.out.println();

        GraphicElement circle = new Circle();
        GraphicElement replaceableCircle = new PositionManipulator(circle);
        ((PositionManipulator) replaceableCircle).setPosition(88, 19);
        GraphicElement sizeableCircle = new SizeManipulator(replaceableCircle);
        ((SizeManipulator) sizeableCircle).setSize(33, 8);
        sizeableCircle.draw();
    }
}

