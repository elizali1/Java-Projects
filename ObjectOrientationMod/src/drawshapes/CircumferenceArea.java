package src.drawshapes;

public class CircumferenceArea {
    public static void main(String[] args){
        Shape[] shape = new Shape[2];

        shape[0] = new Circle(2, 2, 20.0);
        shape[1] = new Rectangle(2,3,2,3);
        System.out.println(shape[0].toString());
        System.out.println(shape[1].toString());

    }
}
