package src;

public class CircumferenceArea {
    public static void main(String[] args){
        Shape[] shape = new Shape[3];

        shape[0] = new Circle(2, 2, 2.00);
        shape[1] = new Rectangle(2,3,2,3);
        shape[2] = new Shape(1,2,"pink");

//        System.out.println(shape[0].getArea());
//        System.out.println(shape[0].getCircumference());
//        System.out.println(shape[1].getArea());
//        System.out.println(shape[1].getCircumference());
//        System.out.println(shape[2].getArea());
//        System.out.println(shape[0].toString());
        System.out.println(shape[0].toString());
        System.out.println(shape[1].toString());
        System.out.println(shape[2].toString());
    }
}
