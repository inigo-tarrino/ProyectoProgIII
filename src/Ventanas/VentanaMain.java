package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;


public class VentanaMain extends JFrame{
	private JButton botonJugar;
	private JButton botoncomoJugar;
	private JButton botoncreditosJuego;
	private static final long serialVersionUID = 1L;
	
	public VentanaMain() {
		
		ImagenInicio p = new ImagenInicio();
		p.setBorder(new EmptyBorder(500, 500, 1000, 600));
		//p.setLayout(new BorderLayout(0, 0));
		setContentPane(p);
		//Metodo necesario
		Container cp = this.getContentPane();
		cp.setSize(1000, 600);
				
				
				
			JPanel panelboton1= new JPanel(new GridBagLayout());//Pnael que contiene los botones
			panelboton1.setBackground(new Color(0, 0, 0, 55));
	
			panelboton1.setLayout(new GridLayout(3, 1)); //Divide el panel main en 1 columna y 3 filas
			
		
			JPanel panelboton2= new JPanel();//Panel padre
			panelboton2.setBackground(new Color(0, 0, 0, 55));
			JPanel panelboton3= new JPanel();
			
			JButton botonJugar = new JButton("Jugar");
			botonJugar.setFont(new Font("ComicSans", Font.PLAIN, 30));
			JButton botoncomoJugar = new JButton("�C�mo jugar?");
			//Button créditos del Juego
			JButton botoncreditosJuego = new JButton("Cr�ditos");
			botoncreditosJuego.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(rootPane, "Este juego fue programado durante el curso 2018-2019 por: \n"
							+ "Iñigo Tarriño Ros \n"
							+ "Jokin Martin Egia \n"
							+ "Sergio Cogollos Del Campo\n"
							+ "Estudiantes de 2. de Ingenier�a Inform�tica de la Universidad de Deusto");
					
				}});
			
			
		    //Fin button créditos del Juego
			
			
			botonJugar.setBackground(Color.WHITE);
			botoncomoJugar.setBackground(Color.white);
			
			panelboton1.add(botonJugar);
			panelboton1.add(botoncomoJugar);
			panelboton1.add(botoncreditosJuego);
			//panelboton2.add(botoncomoJugar);
			//panelboton3.add(botoncreditosJuego);
			panelboton2.add(panelboton1, BorderLayout.SOUTH);
			cp.add(panelboton2, BorderLayout.SOUTH);
			//cp.add(panelboton2);
			//cp.add(panelboton3);
			
		/*Container cp = this.getContentPane();
		
		JPanel centro = new JPanel();
		JPanel izquierda = new JPanel();
		JPanel arribaIzquierda = new JPanel((new GridLayout(2, 5)));
		
		centro.add(centro, BorderLayout.CENTER);
		izquierda.add(arribaIzquierda, BorderLayout.NORTH);
		
		botonJugar = new JButton();
		centro.add(new JLabel("Jugar"));
		botonJugar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Empezar juego
				
			}
			
		});
		
		centro.add(botonJugar);
		cp.add(centro, BorderLayout.CENTER);
		*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setBounds(500, 500, 1000, 600);
		this.setBounds(0, 0, 1280, 900);
		this.setTitle("Inicio RogeLike Dungeons");
		this.pack();
		this.setVisible(true);
	}

public static void main(String[] args) {
	
	
	EventQueue.invokeLater(new Runnable() {

		@Override
		public void run() {
			try {
				VentanaMain frame = new VentanaMain();
				frame.setVisible(true);
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		});
	}
	

	
	
}

