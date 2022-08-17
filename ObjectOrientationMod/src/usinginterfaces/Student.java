package src.usinginterfaces;

public class Student implements Comparable{
    private String firstName;
    private String surname;
    private int studentID;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public Student(String f, String s, int i){
        this.firstName = f;
        this.surname = s;
        this.studentID = i;
    }

    @Override
    public void compareTo() {

    }
}
