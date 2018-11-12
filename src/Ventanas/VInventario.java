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
import javax.swing.border.EmptyBorder;



public class VInventario extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public VInventario() {
	/*
	ImagenInventario s = new ImagenInventario();
	s.setBorder(new EmptyBorder(500, 500, 1000, 600));
	setContentPane(s);	
		*/
	Container cp = this.getContentPane();
	cp.setLayout(new BorderLayout());
	
	//Paneles
	
	JPanel main = new JPanel();
	main.setLayout(new GridLayout(2, 1)); //Divide el panel main en 3 columnas y 4 filas

	JPanel foto= new JPanel();
	
	JButton b = new JButton();
	foto.add(b);
	b.setText("HEY");

	JPanel descnum= new JPanel();
	
	JPanel num = new JPanel();
	num.setLayout(new GridLayout(4, 2)); //Divide el panel main en 4 columna y 1 filas
	num.setLocation(200, 200);
	JButton b1 = new JButton("Pocimas: n");
	JButton b2 = new JButton("Armas");
	JButton b3 = new JButton("???");
	JButton b4 = new JButton("???");
	
	JPanel objetos = new JPanel();
	objetos.setLayout(new GridLayout(1, 4));
	
	JPanel objeto1 = new JPanel();
	objeto1.setLayout(new GridLayout(1, 1));
	/*BufferedImage imagen1 = ImageIO.read(new File("pocima.png"));//no se porque
	JLabel label1 = new JLabel(new ImageIcon(imagen1));
	add(label1);
	objeto1.add(label1);*/
	
	JPanel objeto2 = new JPanel();
	objeto2.setLayout(new GridLayout(1, 1));
	/*BufferedImage imagen2 = ImageIO.read(new File("pocima.png"));//no se porque
	JLabel label2 = new JLabel(new ImageIcon(imagen2));
	add(label2);
	objeto1.add(label2);*/
	
	JPanel objeto3 = new JPanel();
	objeto3.setLayout(new GridLayout(1, 1));
	
	JPanel objeto4 = new JPanel();
	objeto4.setLayout(new GridLayout(1, 1));
	
	foto.add(objetos);
	objetos.add(objeto1);
	objetos.add(objeto2);
	objetos.add(objeto3);
	objetos.add(objeto4);
	
	

	num.add(b1);
	num.add(b2);
	num.add(b3);
	num.add(b4);

	
	cp.add(main);
	main.add(descnum);
	main.add(foto);
	//main.add(desc);
	main.add(num);
	/*desc.add(j1);
	desc.add(j2);
	desc.add(j3);
	desc.add(j4);
	*/}
public static void main(String[] args) {
	VInventario v1 = new VInventario();
	v1.setSize(1000, 600);
	v1.setVisible(true);
	v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	v1.setTitle("Inventario");
}
}
