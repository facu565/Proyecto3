/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import main.ClienteChat;

/**
 *
 * @author facu
 */
public class Frame extends JFrame {
    
    private ClienteChat cliente;
    
    public Frame(){
        iniciarVentana();
        iniciarComponentes();
        cliente = new ClienteChat("192.168.61.11","2000",area);
        cliente.conectar();
        setVisible(true);
    }
    
    
    
    private void iniciarVentana(){
        this.setTitle("Mi ventana");
        this.setSize(800, 500);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    JTextArea area;

    public JTextArea getArea() {
        return area;
    }
    
    
    private void iniciarComponentes(){

         area = new JTextArea();
        area.setBounds(50, 20, 700, 300);
        add(area);
        
        JTextField texto = new JTextField("Ingrese el texto");
        texto.setBounds(50, 360, 700, 30);
        add(texto);
        
         JCheckBox ndeah = new JCheckBox("Texto al final",true);
        ndeah.setBounds(50, 310, 400, 50);
        add(ndeah);
        
        JButton b1=new JButton("Enviar");
        b1.setBounds(400, 410, 150, 40);
        add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String a = texto.getText();
               cliente.EnviarMensaje("Facu", a);
               texto.setText("");
            }
        });
        
        JButton b2 = new JButton("Borrar");
        b2.setBounds(550, 410, 150, 40);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText("");
            }
        });

        
}
        
    
}
