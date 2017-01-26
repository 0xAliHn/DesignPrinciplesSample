//Interface Segregation Principle (ISP):
  //      many client-specific interfaces are better than one general-purpose interface
//This principle defines that a class should never implement an interface that does not go to use. Failure to comply with this principle means that in our implementations we will have dependencies on methods that we do not need but that we are obliged to define.
  //      Therefore, implement specific interfaces is better to implement a general purpose interface. An interface is defined by the client that will use it, so it should not have methods that this client will not implement.



//And a Mustang class that implements the Car:
public class Mustang implements Car {

    @Override
    public void startEngine() {
        // start engine...
    }

    @Override
    public void accelerate() {
        // accelerate...
    }

    //But now the Mustang class is forced to implement the new methods to comply with the Car interface:
    @Override
    public void backToThePast() {
        // because a Mustang can not back to the past!
        throw new UnsupportedOperationException();
    }

    @Override
    public void backToTheFuture() {
        // because a Mustang can not back to the future!
        throw new UnsupportedOperationException();
    }


}

//In this case, Mustang violates the Interface Segregation Principle because should implement methods that do not use.