package Exercise2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Window extends JFrame {
    private JLabel input, event, picture;
    private JTextField text;
    private JButton button;
    private JPanel shapePanel;
    Window(){
        super("Фотокарточка");
        setSize(700,500);
        setLayout(null);
        button = new JButton("Потвердить");
        button.setBounds(175,100,140, 30);
        input = new JLabel();
        input.setText("Введите путь к картинке: ");
        input.setBounds(60, 10, 250, 100);
        // /Users/sheeesh/Documents/Главное/Учёба/2 курс 3 семестр/Java/ДЗ/pract12/dude.jpg
        event = new JLabel();
        event.setBounds(10, 140, 500, 100);
        text = new JTextField();
        text.setBounds(221, 46, 400, 30);
        picture = new JLabel();
        picture.setBounds(100, 150, 500, 300);
        add(event);
        add(text);
        add(input);
        add(button);
        add(picture);
        setVisible(true);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                File check = new File(text.getText());
                ImageIcon icon = new ImageIcon(check.getPath());
                Image img = icon.getImage();
                Image imgScale = img.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon finish = new ImageIcon(imgScale);
                picture.setIcon(finish);
                if (check.exists())
                    event.setText("Картинка: ");
                else
                    event.setText("Такой картинки не существует. Пожалуйста, проверьте введеные путь.");
            }
        });
    }

}

