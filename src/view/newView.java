/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PrefixFreeCompression;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.text.*;
import java.io.*;
import javax.imageio.ImageIO;
import model.TreeValue;

/**
 *
 * @author yoela
 */
public class newView extends JFrame {
    
    
    private JButton btnKompresi;
    private JTextField inputData;
    private JLabel inputJudul;
    private JLabel inputLabel;
    private JLabel outLabel;
    private JLabel encodingBaruLabel;
    private JLabel rangkaianBitLabel;
    private JLabel analisisLabel;
    private JTextPane prefixFreePane; //Pane Encoding Baru
    private JTextPane rangkaianBitFinalPane; // Pane Rangkaian bit hasil final kompresi
    private JTextPane sblmKompresiPane; //Total Byte Teks sebelum kompresi
    private JTextPane finalKompresiPane; //total Byte hasil final kompresi
    
    public void initComponents(){
        setSize(720,1000);//ukuran layout
        setTitle("KOMPRESI HUFFMAN");
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        inputJudul = new JLabel("Program Kompresi Teks Dengan Algoritma Huffman ");
        inputJudul.setBounds(200, 10, 600, 30);
        add(inputJudul);
        
        inputLabel = new JLabel("input(Text): ");
        inputLabel.setBounds(50, 70, 200, 30);
        
        inputData = new JTextField();
        inputData.setBounds(280, 70, 300, 30);
        inputData.setText("");
        add(inputLabel);
        add(inputData);
        
        btnKompresi = new JButton("Proses Kompresi");
        btnKompresi.setBounds(150, 110, 300, 60);
        btnKompresi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //ini ntr tinggal get dari inputLabel
                if(inputData.getText().equals("")){
                    System.out.println(inputData.getText());
                    JOptionPane.showMessageDialog(null, "Text Belum di isi!");
                    
                }else{
                    inputData.getText();
                }
            }
        });
        add(btnKompresi);
        
        outLabel = new JLabel("Output-----------------------------------------------------------------------------------------------------------------------------------------");
        outLabel.setBounds(50 ,150 ,600, 70);
        add(outLabel);
        
        encodingBaruLabel = new JLabel("Encoding Baru (prefix-free code): ");
        encodingBaruLabel.setBounds(50 ,200 ,600, 80);
        add(encodingBaruLabel);
        
        prefixFreePane = new JTextPane();
        prefixFreePane.setBounds(50 ,300 ,600, 120);
        add(prefixFreePane);
        
        rangkaianBitLabel = new JLabel("Rangkaian bit hasil final Kompresi: ");
        rangkaianBitLabel.setBounds(50 ,420 ,600, 80);
        add(rangkaianBitLabel);
      
        rangkaianBitFinalPane = new JTextPane();
        rangkaianBitFinalPane.setBounds(50 ,505 ,600, 120);
        add(rangkaianBitFinalPane);
        
        analisisLabel = new JLabel("Analisis");
        analisisLabel.setBounds(50 ,625 ,600, 60);
        add(analisisLabel);
        
        sblmKompresiPane = new JTextPane();
        sblmKompresiPane.setBounds(50 ,690 ,600, 80);
        add(sblmKompresiPane);
        
        finalKompresiPane = new JTextPane();
        finalKompresiPane.setBounds(50 ,780 ,600, 80);
        add(finalKompresiPane);
        
    }
    
    public newView(){
        initComponents();
    }
    
}
