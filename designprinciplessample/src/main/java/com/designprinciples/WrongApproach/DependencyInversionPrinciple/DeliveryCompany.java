//Dependency Inversion Principle (DIP):
//High-level modules should not depend on low-level modules. Both should depend on abstractions.
  //      Abstractions should not depend on details. Details should depend on abstractions.
    //    The Dependency Inversion Principle means that a particular class should not depend directly on another class, but on an abstraction (interface) of this class.
      //  When we apply this principle we will reduce dependency on specific implementations and thus make our code more reusable.

public class DeliveryCompany {

    public void sendProduct(Product product) {
        DeliveryDriver deliveryDriver = new DeliveryDriver();
        deliveryDriver.deliverProduct(product);
    }
}

//Note that DeliveryCompany creates and uses DeliveryDriver concretions.
// Therefore DeliveryCompany which is a high-level class is dependent on a lower level class and this is a violation of Dependency Inversion Principle.