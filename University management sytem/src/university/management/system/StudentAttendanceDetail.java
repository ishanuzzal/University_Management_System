
package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendanceDetail extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"ID","Date","f_class","s_class","t_class"};
    String d[][]=new String[15][5];  
    int i=0,j=0;
    
    StudentAttendanceDetail(){
        super("View Students Attendence");
        setSize(800,300);
        setLocation(450,150);

        try{
            String q="select * from attendance_student";
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("ID");
                d[i][j++]=rs.getString("Date");
                d[i][j++]=rs.getString("f_class");
                d[i][j++]=rs.getString("s_class");
                d[i][j++]=rs.getString("t_class");
                i++;
                j=0;
            }
            //added 2D array and 1D array in the table
            j1=new JTable(d,h);

        }catch(Exception e){}
        //by defualt layout is border layout
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new StudentAttendanceDetail().setVisible(true);
    }
}