//Liskov Substitution Principle (LSP):
//      Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.
//    This principle was defined by Barbara Liskov and says that objects must be replaceable by instances of their subtypes without altering the correct functioning of our system.
//  Applying this principle we can validate that our abstractions are correct.



//So now we could pass a Square instance where a Rectangle instance is expected.
  //      But if we do this, we can break the assumptions made about the behaviour of Rectangle:
    //    The next assumption is true for Rectangle:

public class LiskovSubstitutionTest {

    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        rectangle.setHeight(5);

        if (rectangle.getArea() == 10) {
            System.out.println(rectangle.getArea());
        }



        //But the same assumption does not hold for Square:
        Rectangle rectangle = new Square(); // Square
        rectangle.setWidth(2);
        rectangle.setHeight(5);

        if (rectangle.getArea() == 10) {
            System.out.println(rectangle.getArea());
        }
    }
    }
}


//Square is not a correct substitution for Rectangle since does not comply with the behaviour of a Rectangle.
   //     The Square / Rectangle hierarchy in isolation did not show any problems however, this violates the Liskov Substitution Principle!