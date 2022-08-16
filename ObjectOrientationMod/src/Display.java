package src;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

public class Display {

       static List<Drawable> myList = new ArrayList<Drawable>();

    private static JPanel canvas;

    public static void main(String[] a) {
        initGUI();
    }

    private static void drawAllShapes(Graphics x) {
        //TODO: Implement me
        Circle myCircle = new Circle(50, 50);
        Rectangle myRect = new Rectangle(100, 100, 100, 80);
        BankAccount myBank = new BankAccount(10000.00, 123456);
        myList.add(myCircle);
        myList.add(myRect);
        myList.add(myBank);
        for (Drawable s : myList){
            s.draw(x);
        };
    }

    private static void initGUI() {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas = new JPanel() {
            public void paintComponent(Graphics x) {
                drawAllShapes(x);
            }
        };
        canvas.setPreferredSize(new Dimension(500,500));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
}
