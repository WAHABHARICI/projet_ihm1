package application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    static JButton buttonmath;
    static JButton buttonarab ;
    static JButton buttonphy;
    static JButton buttonhi;

    public static void main(String[] args) {
        JFrame frame1 = new JFrame();

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(650, 650);
        frame1.getContentPane().setBackground(new Color(50, 50, 50));
        frame1.setLayout(null);

        buttonmath = new JButton("Math");
        buttonmath.addActionListener(new Main());
         buttonarab = new JButton("Arab");
         buttonphy = new JButton("Physics");
         buttonphy.addActionListener(new Main());
         buttonhi = new JButton("History");

        // Set bounds for the buttons
        buttonmath.setBounds(50, 50, 150, 30);
        buttonarab.setBounds(50, 100, 150, 30);
        buttonphy.setBounds(50, 150, 150, 30);
        buttonhi.setBounds(50, 200, 150, 30);

        frame1.add(buttonmath);
        frame1.add(buttonarab);
        frame1.add(buttonphy);
        frame1.add(buttonhi);

        frame1.setResizable(false);
        frame1.setVisible(true);
    }

  
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonmath) {
            Quiz quiz = new Quiz();
            // Perform any additional actions related to the Quiz class
        }
        if (e.getSource() == buttonphy) {
            Quiz1 quiz = new Quiz1();
            // Perform any additional actions related to the Quiz class
        }
        
    }
    
}
