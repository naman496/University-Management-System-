package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        
        setLocation(280, 80);
        setSize(900 , 600);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("University Management System");
        heading.setBounds(70, 20, 800, 130);
        heading.setFont(new Font("Poppins", Font.BOLD, 50));
        add(heading);
        
        JLabel name3 = new JLabel("Developed By:");
        name3.setBounds(70, 170, 550, 40);
        name3.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(name3);
        
        JLabel Dev = new JLabel("NAMAN JAIN");
        Dev.setBounds(70, 220, 550, 40);
        Dev.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(Dev);
        
        JLabel name1 = new JLabel("NITEESH TRIPATHI");
        name1.setBounds(70, 250, 550, 40);
        name1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(name1);
        
        JLabel name2 = new JLabel("PRATOOSH GARG");
        name2.setBounds(70, 280, 550, 40);
        name2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(name2);
        
        

        JLabel rollno1 = new JLabel(" : 2202840310013");
        rollno1.setBounds(350, 220, 550, 40);
        rollno1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno1);
        
        JLabel rollno2 = new JLabel(" : 2202840310014");
        rollno2.setBounds(350, 250, 550, 40);
        rollno2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno2);
        
        JLabel rollno3 = new JLabel(" : 2202840100151");
        rollno3.setBounds(350, 280, 550, 40);
        rollno3.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno3);
        
       
        
        JLabel contact = new JLabel("Contact:");
        contact.setBounds(70, 350, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        JLabel contact1 = new JLabel("namanjain09119@gmail.com");
        contact1.setBounds(70, 380, 550, 40);
        contact1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact1);
        
        JLabel contact2 = new JLabel("niteesht733@gmail.com");
        contact2.setBounds(70, 410, 550, 40);
        contact2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact2);
        
        JLabel contact3 = new JLabel("pratoosh10garg@gmail.com");
        contact3.setBounds(70, 440, 550, 40);
        contact3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact3);
        
        
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
