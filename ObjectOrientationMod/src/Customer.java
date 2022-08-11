public class Customer {
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        // Check whether or not the phone number is:
        // Starts with +44 (UK phone number)
        // Is 10 characters long after the +44
        // Otherwise, print an error and don't set the phone number.
        this.phoneNumber = phoneNumber;
    }

    public Customer(String n, String pN) {
        this.name = n;
        setPhoneNumber(pN);
    }

    public void sendSMS(String message) {
        System.out.println("Sending "+message+ " to # "+this.phoneNumber);
    }
}
