package src.usinginterfaces;

import java.lang.reflect.Array;
import java.util.*;


public class Student implements Comparable<Student> {
    private String firstName;
    private String surname;
    private int studentID;
    static int totalStudents=1;


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

    public Student(String f, String s) {
        this.firstName = f;
        this.surname = s;
        this.studentID = totalStudents;
        totalStudents++;
    }

    public String toString() {
        String firstName = getFirstName();
        String surname = getSurname();
        int studentID = getStudentID();
        return "First Name: " + firstName + " Surname: " + surname + " Student ID: " + studentID;
    }

    @Override
    public int compareTo(Student s) {
        //if last name compared to the last name is 0(equal) AND the first name compared to the first name is also 0(equal), then the names are equal)
        if (this.surname.compareTo(s.surname) == 0 && this.firstName.compareTo(s.firstName) == 0) {
            return 0;
            //if the last name compared to the last name is 0(equal), then move to return/compare first names;
        } else if (this.surname.compareTo(s.surname) == 0) {
            return this.firstName.compareTo(s.firstName);
        }//if first AND last names are not the same(step 1) and last names are not the same(step 2) , compare last names;
        return this.surname.compareTo(s.surname);
    }
    //sort by ID
//    @Override
//    public int compareTo(Student s) {
//            return this.studentID-s.studentID;
//    }

    public static void main(String[] args) {
        List<Student> myArray = new ArrayList<>();
        myArray.add(new Student("Eliza", "Li"));
        myArray.add(new Student("Bob", "Builder"));
        myArray.add(new Student("Larry", "Lobster"));
        myArray.add(new Student("Harry", "Lobster"));
//        for (Student s : myArray) {
//            System.out.println(s);
//        }
        Collections.sort(myArray);
        System.out.println(myArray);
        Comparator<Student> sortByID = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.studentID - o2.studentID;
            }
        };
        Collections.sort(myArray, sortByID);
        System.out.println(myArray);
    }
}



