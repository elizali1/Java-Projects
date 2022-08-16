package src;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

public class Display {
    List<Drawable> myList = new ArrayList<>();
    private static JPanel canvas;

    public static void main(String[] a) {
        initGUI();
    }

    private static void drawAllShapes(Graphics g) {
        //TODO: Implement me
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
