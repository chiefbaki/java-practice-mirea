package Exercise1;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouse implements MouseListener
{
    private String title;
    JFrame current;

    MyMouse(String newTitle, JFrame jframe)
    {
        title = newTitle;
        current = jframe;
    }

    public void mouseClicked(MouseEvent event) {}

    public void mouseEntered(MouseEvent event) {
        JOptionPane.showMessageDialog(current, "Добро пожаловать в " + title,"Диалоговое окно" , JOptionPane.WARNING_MESSAGE);
    }

    public void mouseExited(MouseEvent event) {}

    public void mousePressed(MouseEvent event) {}

    public void mouseReleased(MouseEvent event) {}
}
