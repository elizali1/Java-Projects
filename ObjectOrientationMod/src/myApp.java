public class myApp {
    public static void main(String[] args) {
        Customer charlie = new Customer("Charlie Page", "+441234567890");
        System.out.println(charlie.getName());

        Pet fluffy = new Pet("Fluffy", charlie); // Name = Fluffy, owner = me!
        System.out.println(fluffy.getName());
        fluffy.setName("Floofy");
        System.out.println(fluffy.getName());

        fluffy.textOwner("Come pick up your cat!");

    }
}
