//We have a Car interface:
public interface Car {
    void startEngine();
    void accelerate();

//    Now we have a new requirement to incorporate a new car model:
  //  A DeloRean, but it’s not a common DeLorean. Our DeloRean is very special and has the feature to travel in time.
    //As usual we do not have time to make a good implementation and in addition, the DeloRean has to back to the past urgently.
    //So we decided:
    //Add two new methods for our DeloRean in the Car interface:

    void backToThePast();
    void backToTheFuture();

}