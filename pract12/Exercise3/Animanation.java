package Exercise3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Animanation extends JFrame {

    private JLabel picture = null;

    Animanation(){
        super("Image");
        setSize(400,550);
        setLayout(null);
        picture = new JLabel();
        picture.setBounds(40, 20, 300, 450);
        new Timer(1000, new ActionListener() {
            int counter = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                counter %= 4;
                String [] pictures = new String[]{"cat.jpg", "dude.jpg", "swag.jpg", "cat2.jpg"};
                String path = pictures[counter];
                File check = new File(path);
                ImageIcon icon = new ImageIcon(check.getPath());
                Image img = icon.getImage();
                Image imgScale = img.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon finish = new ImageIcon(imgScale);
                picture.setIcon(finish);
                repaint();
            }
        }).start();
        add(picture);
        setVisible(true);
    }
}
