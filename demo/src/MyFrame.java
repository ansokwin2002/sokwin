import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setVisible(true); // make frame visible
        this.setSize(500,500); // make size page
        this.setTitle("Hello Java"); // set title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // make exit out of application
        this.setResizable(false); // can not resize page
        this.getContentPane().setBackground(new Color(6666));
    }
}
