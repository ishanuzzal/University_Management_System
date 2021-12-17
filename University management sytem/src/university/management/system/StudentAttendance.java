
package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendance extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,th3;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2,fh,sh,th;
    
    StudentAttendance(){
       
        setLayout(new GridLayout(5,2,50,50));
        c2 = new Choice();//storing all roll no from database
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            //storing all the roll number from database
            while(rs.next()){
                c2.add(rs.getString("Roll_No"));    
            }
      
      
       }catch(Exception e){ }
       
        add(new JLabel("Select Roll Number"));
        add(c2);
      
        l1 = new JLabel("First class");
        fh = new Choice();
        fh.add("present");
        fh.add("absent");
        fh.add("leave");
       
        add(l1);
        add(fh);
        
        l2 = new JLabel("Second class");
        sh = new Choice();
        sh.add("present");
        sh.add("absent");
        sh.add("leave");
       
        add(l2);
        add(sh);
        
        
        //3rd class
        th3 = new JLabel("Third class");
        th = new Choice();
        th.add("present");
        th.add("absent");
        th.add("leave");
       
        add(th3);
        add(th);
       
        b1 =new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
        setSize(400,450);
        setLocation(600,200);
       
    }
    
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==b1){
           String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String t = th.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id=c2.getSelectedItem();
        String qry = "insert into attendance_student values('"+ id +"','"+dt+"','"+f+"','"+s+"','"+t+"')";
        
        
       /* conn cc = new conn();
                String q = "insert into teacher values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Teacher Details Inserted Successfully");
                f.setVisible(false);
       */
        try{
            conn c1 = new conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Attendance confirmed");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
       }
       
       else{
           new Project().setVisible(true);
           this.setVisible(false);
       }
        
    }
    
    public static void main(String s[]){
        new StudentAttendance();
    }
}
