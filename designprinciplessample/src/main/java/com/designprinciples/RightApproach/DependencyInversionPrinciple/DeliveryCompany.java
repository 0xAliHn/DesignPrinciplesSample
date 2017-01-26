//Refactor DeliveryCompany that now depends on an abstraction and not off a concretion:

public class DeliveryCompany {

    private DeliveryService deliveryService;

    public DeliveryCompany(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void sendProduct(Product product) {
        this.deliveryService.deliverProduct(product);
    }
}

//Now the dependencies are created elsewhere and are injected through the class constructor.
//It is important not to confuse this principle with the Dependence Injection that is a pattern that helps us to apply this principle to ensure that collaboration between classes does not involve dependencies between them.