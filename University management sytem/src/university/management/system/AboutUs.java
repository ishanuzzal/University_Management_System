package university.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

  private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);      
  }
    
        public AboutUs() {
            
            super("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
    
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon13.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 250, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("University");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(140, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("Developed By :");
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l5.setBounds(70, 198, 600, 35);
            contentPane.add(l5);
            
            JLabel l6 = new JLabel("Safiqul Islam Uzzal");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l6.setBounds(70, 260, 600, 34);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Nusrat Jahan Nory");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 290, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Aysha Akter Sumi ");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l8.setBounds(70, 320, 600, 34);
            contentPane.add(l8);


            JLabel l9 = new JLabel("Md. Ashraful Rahman");
            //l10.setForeground(new Color(47, 79, 79));
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 18));
            l9.setBounds(70, 350, 600, 34);
            contentPane.add(l9);
                
                
            contentPane.setBackground(Color.WHITE);
  }
        

}


