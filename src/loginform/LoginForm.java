/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import javax.swing.*;

/**
 *
 * @author Kurnia Indah N
 */
public class LoginForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI g = new GUI ();
    }
    
}

class GUI extends JFrame{
   JLabel luser = new JLabel(" Username ");
   final JTextField user = new JTextField (20);
   JLabel lpass = new JLabel(" Password ");
   final JTextField pass = new JTextField (10);
   JButton btnSave = new JButton("Login");
   
   public GUI(){
       setTitle("Login");
            setDefaultCloseOperation(3);
            setSize(400,150);
            
            btnSave.addActionListener(((e)->{
            if(user.getText().equals("admin") && pass.getText().equals("12345")){
                Biodata b = new Biodata ();
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Username atau Password salah");
            }
            }));
            
        setLayout(null);
            add(luser);
            add(user);
            add(lpass);
            add(pass);
            add(btnSave);
            
            luser.setBounds(10,15,120,10);
            user.setBounds(100,10,200,20);
            lpass.setBounds(10,40,120,10);
            pass.setBounds(100,35,200,20);
            btnSave.setBounds(50,65,70,20);
            setVisible(true);
}
}
