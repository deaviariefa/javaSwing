//Deavi Ariefa Widiasmara
//124190010
package Tugas2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class javaSwing {
   public static void main(String[] args) {
	GUI g = new GUI();
   }
}

class GUI extends JFrame {
   final JTextField fnama = new JTextField(50);

   JLabel lnama = new JLabel(" Nama ");
   
   JLabel lnim = new JLabel(" NIM ");
   final JTextField fnim = new JTextField(10);

   JLabel lttl = new JLabel(" Tempat Tanggal Lahir ");
   final JTextField fttl = new JTextField(50); 
   
   JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
   JRadioButton rblaki = new JRadioButton(" Laki-Laki ");
   JRadioButton rbperempuan = new JRadioButton("Perempuan ");

   JLabel lagama = new JLabel(" Agama ");
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha","Kong Hu Cu"};
   JComboBox cmbAgama = new JComboBox(namaAgama);
   
   JLabel lkotaasal = new JLabel(" Asal Kota ");
   final JTextField fkotaasal = new JTextField(20);

   JLabel lhobi = new JLabel(" Hobi ");
   JCheckBox cbNgoding = new JCheckBox(" Ngoding ");
   JCheckBox cbGame = new JCheckBox(" Main Game ");
   JCheckBox cbNulis = new JCheckBox(" Menulis ");
   JCheckBox cbBerolahraga = new JCheckBox(" Berolahraga ");
   JCheckBox cbFotografi = new JCheckBox(" Fotografi ");
   JCheckBox cbSosmed = new JCheckBox(" Main Sosmed ");
   JCheckBox cbMusik = new JCheckBox(" Musik ");
   JCheckBox cbDs = new JCheckBox(" Desain Grafis ");
   JCheckBox cbMasak = new JCheckBox(" Masak dan Makan ");

   JButton btnSave = new JButton("Save");
   JButton btnReset = new JButton("Reset");
   JButton btnClose = new JButton("Exit");

   public GUI() {
	setTitle("Biodata");
	setDefaultCloseOperation(3);
	setSize(600,550);

	ButtonGroup group = new ButtonGroup();
	group.add(rblaki);
	group.add(rbperempuan);

	setLayout(null);
        add(lnama);
        add(fnama);
        add(lnim);
        add(fnim);
        add(lttl);
        add(fttl);
        add(ljeniskelamin);
        add(rblaki);
        add(rbperempuan);
        add(lagama);
        add(cmbAgama);
        add(lkotaasal);
        add(fkotaasal);
        add(lhobi);
        add(cbNgoding);
        add(cbGame);
        add(cbNulis);
        add(cbBerolahraga);
        add(cbFotografi);
        add(cbSosmed);
        add(cbMusik);
        add(cbDs);
        add(cbMasak);
        add(btnSave);
        add(btnReset);
        add(btnClose);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
	lnama.setBounds(10,10,120,30);
        lnama.setBounds(15,10,120,20);
        fnama.setBounds(175,10,200,20);
        lnim.setBounds(10,40,120,20);
        lnim.setBounds(18,40,120,20);
        fnim.setBounds(175,40,200,20);
        lttl.setBounds(10,70,150,20);
        lttl.setBounds(18,70,150,20);
        fttl.setBounds(175,70,200,20);
        ljeniskelamin.setBounds(10,100,120,20);
        ljeniskelamin.setBounds(15,100,120,20);
	rblaki.setBounds(175,100,100,20);
        rbperempuan.setBounds(275,100,100,20);
        lagama.setBounds(10,130,200,20);
        lagama.setBounds(16,130,200,20);
	cmbAgama.setBounds(175,130,200,20);
        lkotaasal.setBounds(10,160,120,20);
        lkotaasal.setBounds(18,160,120,20);
	fkotaasal.setBounds(175,160,200,20);
        lhobi.setBounds(10,190,120,20);
	lhobi.setBounds(16,190,120,20);
	cbNgoding.setBounds(175,190,120,20);
        cbGame.setBounds(275,190,120,20);
        cbNulis.setBounds(380,190,120,20);
        cbBerolahraga.setBounds(175,210,120,20);
        cbFotografi.setBounds(275,210,100,20);
        cbSosmed.setBounds(380,210,120,20);
        cbMusik.setBounds(175,230,120,20);
        cbDs.setBounds(275,230,120,20);
        cbMasak.setBounds(380,230,140,20);
        btnSave.setBounds(175,280,120,20);
        btnReset.setBounds(175,310,120,20);
        btnClose.setBounds(175,340,120,20);

    setVisible(true);
   }
}
