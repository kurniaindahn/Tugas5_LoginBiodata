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
public class Simpan extends JFrame {
   String nama, jk, agama, hobby;
   JLabel lnama = new JLabel(" Nama Lengkap :");
   JLabel ljk = new JLabel(" Jenis Kelamin :");
   JLabel lagama = new JLabel(" Agama :");
   JLabel lhobby = new JLabel(" Hobby :");
   JLabel snama = new JLabel();
   JLabel sjk = new JLabel();
   JLabel sagama = new JLabel();
   JLabel shobby = new JLabel();
   
   public Simpan(String nama, String jk, String agama, String hobby){
       this.nama=nama;
       this.jk=jk;
       this.agama=agama;
       this.hobby=hobby;
       snama.setText(nama);
       sjk.setText(jk);
       sagama.setText(agama);
       shobby.setText(hobby);
       
       setTitle("Biodata");
            setDefaultCloseOperation(3);
            setSize(350,500);
            
            setLayout(null);
            add(lnama);
            add(snama);
            add(ljk);
            add(sjk);
            add(lagama);
            add(sagama);
            add(lhobby);
            add(shobby);
            
            lnama.setBounds(10,10,120,20);
            snama.setBounds(130,10,150,20);
            ljk.setBounds(10,35,120,20);
            sjk.setBounds(130,35,100,20);
            lagama.setBounds(10,60,150,20);
            sagama.setBounds(130,60,150,20);
            lhobby.setBounds(10,85,120,20);
            shobby.setBounds(127,85,100,20);
            setVisible(true);
                  
   }
   
}
