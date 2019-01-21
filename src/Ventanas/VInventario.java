package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.image.BufferedImage;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import PJ.Personaje;



public class VInventario extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public VInventario() {
	
	Container cp = this.getContentPane();
	cp.setLayout(new BorderLayout());
	
	
	
	JPanel main = new JPanel();
	main.setLayout(new GridLayout(2, 2));
	

	
	
	JPanel info = new JPanel();
	JTextField prueb = new JTextField("Información sobre el personaje");
	info.add(prueb);
	
	
	
	
	
	JPanel num= new JPanel();
	num.setLayout(new GridLayout(4, 1));
	JButton b1 = new JButton("POCIMAS : "+VentanaT.potcount);
	JButton b2 = new JButton("ARMADURA :"+VentanaT.pacount);
	JButton b3 = new JButton("VENDAS :"+VentanaT.vcount);
	JButton b4 = new JButton("PAN :"+VentanaT.pacount);
	b1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(VentanaT.potcount > 0) 
			{
				Personaje.hp = Personaje.hp + 30;
				VentanaT.potcount--;
			}
		}
	});
	b2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(VentanaT.pcount > 0) 
			{
				Personaje.hp = Personaje.hp + 5;
				VentanaT.pcount--;
			}

		}
	});
	b3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(VentanaT.vcount > 0) 
			{
				Personaje.hp = Personaje.hp + 10;
				VentanaT.vcount--;
			}

		}
	});
	b4.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(VentanaT.pacount > 0) 
			{
				Personaje.hp = Personaje.hp + 7;
				VentanaT.pacount--;
			}
		}
	});
	num.add(b1);
	num.add(b2);
	num.add(b3);
	num.add(b4);
	
	JPanel descnum= new JPanel();
	ImageIcon icon = new ImageIcon(getClass().getResource("Icono.png")); 
	JLabel label = new JLabel(icon); 
	descnum.add(label);
	
	
	JPanel otros = new JPanel();
	JTextField prueba = new JTextField("Otros");
	otros.add(prueba);
	
	
	
	info.setBackground(new Color(78, 87, 84));
	descnum.setBackground(new Color(78, 87, 84));
	otros.setBackground(new Color(78, 87, 84));
	num.setBackground(new Color(78, 87, 84));
	
	cp.add(main);
	main.add(descnum);
	main.add(num);
	main.add(info);
	main.add(otros);
	
	}
public static void main(String[] args) {
	VInventario v1 = new VInventario();
	v1.setSize(1000, 600);
	v1.setVisible(true);
	v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	v1.setTitle("Inventario");
	
}
}
