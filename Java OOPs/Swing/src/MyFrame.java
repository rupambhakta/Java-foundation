import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Rupam Bhakta");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setVisible(true);
        this.setResizable(false);
        ImageIcon image = new ImageIcon("camera2.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(30, 31, 34));
    }
}
