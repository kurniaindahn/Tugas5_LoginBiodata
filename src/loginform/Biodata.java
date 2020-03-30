/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Kurnia Indah N
 */
class Biodata extends JFrame {
    String nama, jk, agama, hobby;
    final JTextField fnama = new JTextField(10);

   JLabel lnama = new JLabel(" Nama Lengkap ");
   JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");

   JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
   JRadioButton rbWanita = new JRadioButton("Perempuan ");

   JLabel lagama = new JLabel(" Agama ");
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
   JComboBox cmbAgama = new JComboBox(namaAgama);

   JLabel lhobby = new JLabel(" Hobby ");

   JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
   JCheckBox cbBasket = new JCheckBox(" Basket ");

   JButton btnSave = new JButton("OK");
   
   public Biodata() {
    setTitle("Biodata");
            setDefaultCloseOperation(3);
            setSize(350,500);
            
            ButtonGroup group = new ButtonGroup();
            group.add(rbPria);
            group.add(rbWanita);

            setLayout(null);
            add(lnama);
            add(fnama);
            add(ljeniskelamin);
            add(rbPria);
            add(rbWanita);
            add(lagama);
            add(cmbAgama);
            add(lhobby);
            add(cbSepakbola);
            add(cbBasket);
            add(btnSave);

            // setBounds(m,n,o,p)
            // m = posisi x; n = posisi n
            // o = panjang komponen; p = tinggi komponen
            lnama.setBounds(10,10,120,20);
            fnama.setBounds(130,10,150,20);
            ljeniskelamin.setBounds(10,35,120,20);
            rbPria.setBounds(130,35,100,20);
            rbWanita.setBounds(230,35,100,20);
            lagama.setBounds(10,60,150,20);
            cmbAgama.setBounds(130,60,150,20);
            lhobby.setBounds(10,85,120,20);
            cbSepakbola.setBounds(130,85,100,20);
            cbBasket.setBounds(230,85,150,20);
            btnSave.setBounds(100,130,120,20);
            setVisible(true);
            
            btnSave.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
            if(fnama.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Nama tidak boleh kosong");
            }
            else{
                nama = fnama.getText();
            }
            if(rbPria.isSelected()){
                jk = rbPria.getText();
            }
            else if(rbWanita.isSelected()){
                jk = rbWanita.getText();
            }
                agama = (String) cmbAgama.getSelectedItem();

            
            if(cbBasket.isSelected()){
                hobby = cbBasket.getText();
            }
            else if(cbSepakbola.isSelected()){
                hobby = cbSepakbola.getText();
            }
            Simpan s = new Simpan(nama, jk, agama, hobby);
            dispose();
            }
            } );
            setVisible(true);
   }
}



