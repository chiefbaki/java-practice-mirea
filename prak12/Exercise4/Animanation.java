package Exercise4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;

public class Animanation extends JFrame {

    private JLabel picture = null;

    Animanation(){
        super("Image");
        setSize(600,400);
        setLayout(null);
        picture = new JLabel();
        picture.setBounds(40, 20, 500, 300);
        new Timer(1000, new ActionListener() {
            int counter = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                counter %= 3;
                String [] pictures = new String[]{"avatardock.jpg", "avatars.jpg", "avatar.jpg"};
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
