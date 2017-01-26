//Violation of SRP:
//We have a Customer class that has more than one responsibility:
// storeCustomer(String name) has the responsibility of store a Customer into the database so it is a responsibility of persistence and should be out of Customer class.
//generateCustomerReport(String name) has the responsibility of generating a report about Customer so also should be out of Customer class
//When a class has multiple responsibilities it is more difficult to understand, extend and modify.

public class Customer {

    private String name;

    // getter and setter methods...

    // This is a Responsibility
    public void storeCustomer(String customerName) {
        // store customer into a database...
    }

    // This is another Responsibility
    public void generateCustomerReport(String customerName) {
        // generate a report...
    }
}