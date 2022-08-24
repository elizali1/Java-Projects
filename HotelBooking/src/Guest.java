public class Guest {
    String firstName;
    String surName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    public Guest(String fN, String sN){
        this.firstName = fN;
        this.surName = sN;
    }
    public String toString(){
        return "Welcome "+firstName+" "+surName;
    }
}
