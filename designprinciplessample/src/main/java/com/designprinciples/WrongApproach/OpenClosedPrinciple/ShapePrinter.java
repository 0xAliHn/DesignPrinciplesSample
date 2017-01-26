//Open Closed Principle (OCP):
  //      Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification
    //    According to this principle, a software entity must be easily extensible with new features without having to modify its existing code in use.
      //  open for extension: new behaviour can be added to satisfy the new requirements.
        //close for modification: to extending the new behaviour are not required modify the existing code.
        //If we apply this principle we will get extensible systems that will be less prone to errors whenever the requirements are changed. We can use the abstraction and polymorphism to help us apply this principle.

//we have a ShapePrinter class that draws several types of shapes:
public class ShapePrinter {

    public void drawShape(Object shape) {

        if (shape instanceof Rectangle) {
            // Draw Rectangle...
        } else if (shape instanceof Square) {
            // Draw Square...
        }
    }
}


    //We can see that every time we want to draw a distinct shape we will have to modify the drawShape method of the ShapePrinter to accept a new shape.
      //  As new types of shapes come to draw, the ShapePrinter class will be more confusing and fragile to changes.
        //Therefore the ShapePrinter class is not closed for modification.