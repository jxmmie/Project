import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;

public class GUI {
    public void mygui()
    {
        Myframe frame1=new Myframe();
        frame1.setVisible(true);
    }
}

class Myframe extends JFrame {
    JPanel panel = new JPanel();

    Myframe() {
        setSize(700, 500);
        setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setSize(700, 500);
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                Color color = new Color(x / 2, y / 2, (x + y) / 4);
                panel.setBackground(color);
            }
        });

        add(panel);
    }
}