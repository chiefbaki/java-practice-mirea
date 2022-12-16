package Exercise1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

class Match extends JFrame {
    int scoreMilan = 0, scoreMadrid = 0;
    JLabel result = new JLabel("Result: 0 x 0");
    JLabel lastScore = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JButton buttonMilan = new JButton(" AC Milan");
    JButton buttonMadrid = new JButton(" Real Madrid");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    Match() {
        super("Application");
        setSize(400, 300);
        setLayout(null);
        winner.setBounds(120, 25, 200, 50);
        winner.setFont(fnt);
        add(winner);
        result.setBounds(140, 60, 200, 50);
        result.setFont(fnt);
        add(result);
        lastScore.setBounds(90, 95, 250, 50);
        lastScore.setFont(fnt);
        add(lastScore);
        buttonMilan.setBounds(20, 150,150 , 75);
        buttonMilan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                goal("AC Milan");
            }
        });
        add(buttonMilan);
        buttonMadrid.setBounds(210, 150,150 , 75);
        buttonMadrid.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                goal("Real Madrid");
            }
        });
        add(buttonMadrid);
        setVisible(true);
    }

    public void goal(String team){
        if (Objects.equals(team, "AC Milan") )
            scoreMilan++;
        else
            scoreMadrid++;
        result.setText("Result: " + scoreMilan + " x " + scoreMadrid);
        lastScore.setText("Last Scorer: " + team);
        if (scoreMilan == scoreMadrid)
            winner.setText("Winner: N/A");
        else if (scoreMilan > scoreMadrid)
            winner.setText("Winner: AC Milan");
        else
            winner.setText("Winner: Real Madrid");
    }
}
