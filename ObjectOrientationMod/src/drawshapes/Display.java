package src.drawshapes;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
    private static void drawAllShapes(Graphics g) {
        //TODO: Implement me
        Circle myCircle = new Circle(65, 10, 200.0);
        Rectangle myRect = new Rectangle(10, 10, 300, 200);
        BankAccount myBank = new BankAccount(2500,1234567,35,115);
        myList.add(myRect);
        myList.add(myCircle);
        myList.add(myBank);
        for (Drawable s : myList){
            s.draw(g);
        };
    }

    private static void initGUI() {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas = new JPanel() {
            public void paintComponent(Graphics g) {
                drawAllShapes(g);
            }
        };
        canvas.setPreferredSize(new Dimension(500,500));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
}
