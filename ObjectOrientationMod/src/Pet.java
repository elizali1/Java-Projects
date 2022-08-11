public class Pet {
    private String name;
    private Customer owner;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Customer getOwner() {
        return owner;
    }
    public void textOwner(String message) {
        owner.sendSMS(message);
    }

    public Pet(String n, Customer o) {
        this.name = n;
        this.owner = o;
    }
}
