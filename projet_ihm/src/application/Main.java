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
    static JButton button_dif ;
    static JButton button_easy;
    static JButton button_dif1 ;
    static JButton button_easy1;
    static JButton button_dif2 ;
    static JButton button_easy2;
    public static void main(String[] args) {
        JFrame frame1 = new JFrame();

       // frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(650, 650);
        frame1.getContentPane().setBackground(new Color(50, 50, 50));
        frame1.setLayout(null);

        buttonmath = new JButton("Math");
        buttonmath.addActionListener(new Main());
        
         buttonarab = new JButton("Arab");
         buttonarab.addActionListener(new Main());
         
         buttonphy = new JButton("Physics");
         buttonphy.addActionListener(new Main());
         
         buttonhi = new JButton("History");
         buttonhi.addActionListener(new Main());
         

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
//    	JButton button_dif = null;
//        JButton button_easy = null ;
        
        if (e.getSource() == buttonmath) {
        	JFrame frame2 = new JFrame();
        	//JButton button_dif ;
           //JButton button_easy;
            button_dif = new JButton("diffuclt");
            button_dif.addActionListener(new Main());
            button_easy = new JButton("easy");
            button_easy.addActionListener(new Main());
            button_dif.setBounds(50, 50, 150, 30);
            button_easy.setBounds(50, 100, 150, 30);
            //frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setSize(650, 650);
            frame2.getContentPane().setBackground(new Color(50, 50, 50));
            frame2.setLayout(null);
            frame2.add(button_dif);
            frame2.add(button_easy);
        	frame2.setVisible(true);
        	 
        	
        	
        }
       
		if  (e.getSource() == button_easy) {
        	quiz1_easy quiz = new quiz1_easy();
    		
         }
        
        
		if  (e.getSource() == button_dif) {
        	Quiz quiz = new Quiz();
         }
               
            
        		
        	
        
        
       if (e.getSource() == buttonphy) {
    	   JFrame frame2 = new JFrame();
    	   button_dif1 = new JButton("diffuclt");
           button_dif1.addActionListener(new Main());
           button_easy1 = new JButton("easy");
           button_easy1.addActionListener(new Main());
           button_dif1.setBounds(50, 50, 150, 30);
           button_easy1.setBounds(50, 100, 150, 30);
          // frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame2.setSize(650, 650);
           frame2.getContentPane().setBackground(new Color(50, 50, 50));
           frame2.setLayout(null);
           frame2.add(button_dif1);
           frame2.add(button_easy1);
       	frame2.setVisible(true);
       }
       if(e.getSource() == button_dif1){
            Quiz1 quiz = new Quiz1();
            // Perform any additional actions related to the Quiz class
        }
       if(e.getSource() == button_easy1){
           Quiz2_easy quiz = new Quiz2_easy();
           // Perform any additional actions related to the Quiz class
       }
       
       if (e.getSource() == buttonarab) {
       	JFrame frame2 = new JFrame();
       	//JButton button_dif ;
          //JButton button_easy;
           button_dif2 = new JButton("diffuclt");
           button_dif2.addActionListener(new Main());
           button_easy2 = new JButton("easy");
           button_easy2.addActionListener(new Main());
           button_dif2.setBounds(50, 50, 150, 30);
           button_easy2.setBounds(50, 100, 150, 30);
           //frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame2.setSize(650, 650);
           frame2.getContentPane().setBackground(new Color(50, 50, 50));
           frame2.setLayout(null);
           frame2.add(button_dif2);
           frame2.add(button_easy2);
       	frame2.setVisible(true);
       	 
       	
       	
       }
       if  (e.getSource() == button_easy2) {
       	Quiz3_easy quiz = new Quiz3_easy();
   		
        }
       
       
		if  (e.getSource() == button_dif2) {
       	Quiz2 quiz = new Quiz2();
        }
       
       
        
    
    
    
    }
}