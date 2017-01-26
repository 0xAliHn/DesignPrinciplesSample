//A solution:

public class ShapePrinter {

    public void drawShape(Shape shape) {
        shape.draw();
    }
}

    //Now the ShapePrinter class remains intact when we add a new shape type.
      //  The existing code is not modified.
        //So if we want to add more types of shapes we just have to create a class for that shape.