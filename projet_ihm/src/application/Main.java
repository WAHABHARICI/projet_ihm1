package application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    static JButton buttonmath;
    static JButton buttonGeography ;
    static JButton buttonphy;
    static JButton buttonhistory;
    static JButton buttonscience;
    static JButton buttonlanguages;
    
    static JButton button_dif ;
    static JButton button_easy;
    
    static JButton button_dif1 ;
    static JButton button_easy1;
    
    static JButton button_dif2 ;
    static JButton button_easy2;
    
    static JButton button_dif3 ;
    static JButton button_easy3;
    
    static JButton button_dif4 ;
    static JButton button_easy4;
    
    static JButton button_dif5 ;
    static JButton button_easy5;
    
    public static void main(String[] args) {
        JFrame frame1 = new JFrame();

       // frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(650, 650);
        frame1.getContentPane().setBackground(new Color(50, 50, 50));
        frame1.setLayout(null);

        buttonmath = new JButton("Math");
        buttonmath.addActionListener(new Main());
        
         buttonGeography = new JButton("Geography");
         buttonGeography.addActionListener(new Main());
         
         buttonphy = new JButton("Physics");
         buttonphy.addActionListener(new Main());
         
         buttonhistory = new JButton("History");
         buttonhistory.addActionListener(new Main());
         
         buttonscience = new JButton("Science");
         buttonscience.addActionListener(new Main());
         
         
         buttonlanguages = new JButton("Languages");
         buttonlanguages.addActionListener(new Main());
         
         
        // Set bounds for the buttons
        buttonmath.setBounds(50, 50, 150, 30);
        buttonGeography.setBounds(50, 100, 150, 30);
        buttonphy.setBounds(50, 150, 150, 30);
        buttonhistory.setBounds(50, 200, 150, 30);
        buttonscience.setBounds(50, 250, 150, 30);
        buttonlanguages.setBounds(50, 300, 150, 30);

        frame1.add(buttonmath);
        frame1.add(buttonGeography);
        frame1.add(buttonphy);
        frame1.add(buttonhistory);
        frame1.add(buttonscience);
        frame1.add(buttonlanguages);

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
       
       if (e.getSource() == buttonGeography) {
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
       
		
		
		if (e.getSource() == buttonhistory) {
        	JFrame frame2 = new JFrame();
        	//JButton button_dif ;
           //JButton button_easy;
            button_dif3 = new JButton("diffuclt");
            button_dif3.addActionListener(new Main());
            button_easy3 = new JButton("easy");
            button_easy3.addActionListener(new Main());
            button_dif3.setBounds(50, 50, 150, 30);
            button_easy3.setBounds(50, 100, 150, 30);
            //frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setSize(650, 650);
            frame2.getContentPane().setBackground(new Color(50, 50, 50));
            frame2.setLayout(null);
            frame2.add(button_dif3);
            frame2.add(button_easy3);
        	frame2.setVisible(true);
        	 
        	
        	
        }
       
		if  (e.getSource() == button_easy3) {
        	History_easy quiz = new History_easy();
    		
         }
        
        
		if  (e.getSource() == button_dif3) {
        	History_dif quiz = new History_dif();
         }
		
		
		
		
		if (e.getSource() == buttonscience) {
        	JFrame frame2 = new JFrame();
        	//JButton button_dif ;
           //JButton button_easy;
            button_dif4 = new JButton("diffuclt");
            button_dif4.addActionListener(new Main());
            button_easy4 = new JButton("easy");
            button_easy4.addActionListener(new Main());
            button_dif4.setBounds(50, 50, 150, 30);
            button_easy4.setBounds(50, 100, 150, 30);
            //frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setSize(650, 650);
            frame2.getContentPane().setBackground(new Color(50, 50, 50));
            frame2.setLayout(null);
            frame2.add(button_dif4);
            frame2.add(button_easy4);
        	frame2.setVisible(true);
        	 
        	
        	
        }
       
		if  (e.getSource() == button_easy4) {
        	Science_easy quiz = new Science_easy();
    		
         }
        
        
		if  (e.getSource() == button_dif4) {
			Science_diff quiz = new Science_diff();
         }
        
		
		if (e.getSource() == buttonlanguages) {
        	JFrame frame2 = new JFrame();
        	//JButton button_dif ;
           //JButton button_easy;
            button_dif5 = new JButton("diffuclt");
            button_dif5.addActionListener(new Main());
            button_easy5 = new JButton("easy");
            button_easy5.addActionListener(new Main());
            button_dif5.setBounds(50, 50, 150, 30);
            button_easy5.setBounds(50, 100, 150, 30);
            //frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setSize(650, 650);
            frame2.getContentPane().setBackground(new Color(50, 50, 50));
            frame2.setLayout(null);
            frame2.add(button_dif5);
            frame2.add(button_easy5);
        	frame2.setVisible(true);
        	 
        	
        	
        }
       
		if  (e.getSource() == button_easy5) {
        	Languages_easy quiz = new Languages_easy();
    		
         }
        
        
		if  (e.getSource() == button_dif4) {
			Languages_dif quiz = new Languages_dif();
         }
        
    
    
    
    }
}