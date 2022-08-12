public class Product {
    private String name;
    private double price;
    private int quantity;
    //    private double totalprice;
//
//    public double getTotalprice(){
//        return totalprice;
//    }
//    public void setTotalprice(){
//        this.totalprice = totalprice;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String n, Double p, Integer q) {
        this.name = n;
        this.price = p;
        this.quantity = q;
    }
    public void displayPrice() {
        System.out.println("You have " + this.quantity + " " + this.name + "(s) which costs " + this.price + " each.");
    }

    public Double totalItemPrice() {
        Double tp= 0.0;
        tp = quantity*price;
        System.out.println("The total for " + this.quantity +" "+ this.name +"(s) will be " + this.price * this.quantity + ".");
        return tp;
    }
    //    public Double allItemPrice(){
//        System.out.println(this.price*this.quantity);
//        return null;
    @Override
    public String toString() {
        return this.name +" " + this.price +" "+ this.quantity;
    }
}
