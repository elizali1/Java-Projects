package src.objectsandclasses;

public class Trade {
    private String ID;
    private String Symbol;
    private int Quantity;
    private double Price;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        this.Symbol = symbol;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.Price = price;
        }
    }

    public Trade(String ID, String s, Integer q, double p) {
        this.ID = ID;
        this.Symbol = s;
        this.Quantity = q;
        if (Price >0.00 ){
            this.Price = p;
        } else {
            System.out.println("Negative price. ERROR.");
        }
    }
    public Trade(String ID, String s, Integer q) {
        this.ID = ID;
        this.Symbol = s;
        this.Quantity = q;
    }
    public String toString() {
        return "ID: " +this.ID + " SYM: "+this.Symbol + " Quantity: " +this.Quantity +" Price: "+this.Price;
    }
}
