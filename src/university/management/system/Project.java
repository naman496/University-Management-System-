package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setLocation(280, 80);
        setSize(900 , 600);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
        // New Information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        newInformation.setFont(new Font("Poppins", Font.PLAIN, 20));
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.setFont(new Font("Poppins", Font.PLAIN, 15));
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.setFont(new Font("Poppins", Font.PLAIN, 15));
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        // Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLUE);
        details.setFont(new Font("Poppins", Font.PLAIN, 20));
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.setFont(new Font("Poppins", Font.PLAIN, 15));
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.setFont(new Font("Poppins", Font.PLAIN, 15));
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        // Fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLACK);
        fee.setFont(new Font("Poppins", Font.PLAIN, 20));
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.setFont(new Font("Poppins", Font.PLAIN, 15));
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.setFont(new Font("Poppins", Font.PLAIN, 15));
        feeform.addActionListener(this);
        fee.add(feeform);      
       
        
        //About
        JMenu About = new JMenu("About");
        About.setForeground(Color.BLACK);
        About.setFont(new Font("Poppins", Font.PLAIN, 20));
        mb.add(About);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.setFont(new Font("Poppins", Font.PLAIN, 15));
        ab.addActionListener(this);
        About.add(ab);
      
        // Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        exit.setFont(new Font("Poppins", Font.PLAIN, 20));
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ab.setFont(new Font("Poppins", Font.PLAIN, 15));
        ex.addActionListener(this);
        exit.add(ex);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        } else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        }  else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }  else if (msg.equals("About")) {
            new About();
        } 
    }

    public static void main(String[] args) {
        new Project();
    }
}
