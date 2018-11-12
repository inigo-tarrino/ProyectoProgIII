package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;


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
	/*
	JPanel desc = new JPanel();
	desc.setLayout(new GridLayout(4, 1)); //Divide el panel main en 1 columna y 4 filas
	JLabel j1 = new JLabel("pociones");
	JLabel j2 = new JLabel("eded");
	JLabel j3 = new JLabel("wedewd");
	JLabel j4 = new JLabel("deed");
	*/
	JPanel num = new JPanel();
	num.setLayout(new GridLayout(4, 2)); //Divide el panel main en 4 columna y 1 filas
	JButton b1 = new JButton("Pocimas: n");
	JButton b2 = new JButton("Pocimas: n");
	JButton b3 = new JButton("Pocimas: n");
	JButton b4 = new JButton("Pocimas: n");

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
