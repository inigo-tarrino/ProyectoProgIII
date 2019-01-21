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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import DB.Bestiario;
import PJ.Personaje;


public class VentanaMain extends JFrame{
	
	//Definimos el log
	static Logger log;
	private JButton botonJugar;
	private JButton botoncomoJugar;
	private JButton botoncreditosJuego;
	private static final long serialVersionUID = 1L;
	
	public VentanaMain() {
		
		Personaje.inicializar();
		ImagenInicio p = new ImagenInicio();
		p.setBorder(new EmptyBorder(500, 500, 1000, 600));
		//p.setLayout(new BorderLayout(0, 0));
		setContentPane(p);
		//Metodo necesario
		Container cp = this.getContentPane();
		cp.setSize(1000, 600);
				
				
				
			JPanel panelboton1= new JPanel(new GridBagLayout());//Pnael que contiene los botones
			panelboton1.setBackground(new Color(0, 0, 0, 55));
			
			JPanel panelpref= new JPanel(new GridBagLayout());//Panel que contiene 2 los botones
			panelpref.setBackground(new Color(0, 0, 0, 55));
			//Toquitear para poner cordenadas en 0 0 panelpref.setBounds();
	
			panelboton1.setLayout(new GridLayout(4, 1)); //Divide el panel main en 1 columna y 4 filas
			
		
			JPanel panelboton2= new JPanel();//Panel padre
			panelboton2.setBackground(new Color(0, 0, 0, 55));
			JPanel panelboton3= new JPanel();
			
			JButton Pref = new JButton("Preferencias");
			JButton Salir = new JButton("Salir");
			
			JButton botonJugar = new JButton("Jugar");
			botonJugar.setFont(new Font("ComicSans", Font.PLAIN, 30));
			JButton botoncomoJugar = new JButton("�Como jugar?");
			JButton botonBestiario = new JButton("Bestiario");
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
			panelboton1.add(botonBestiario);
			panelboton1.add(botoncomoJugar);
			panelboton1.add(botoncreditosJuego);
			
			panelpref.add(Pref);
			panelpref.add(Salir);
			
			//panelboton2.add(botoncomoJugar);
			//panelboton3.add(botoncreditosJuego);
			panelboton2.add(panelboton1, BorderLayout.SOUTH);
			cp.add(panelboton2, BorderLayout.SOUTH);
			cp.add(panelpref,BorderLayout.NORTH);
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
	
		botonJugar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				VentComp v1 = new VentComp();
				v1.setSize(1980, 1020);
				v1.setVisible(true);
				v1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				v1.setTitle("RogeLike Dungeons");
			}
		}
		);
		
		//Habria que a�adirlo al main para que nos salte por consola cuando
		//Hemos cerrado la app.
	
		botonBestiario.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Bestiario b1 = new Bestiario();
				b1.setSize(1500, 400);
				b1.setVisible(true);
				b1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				b1.setTitle("Info Bestias");
			}
		}
		);
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				log.log(Level.INFO, "Programa cerrado."+ new Date());
				//log.close();
			}

		});
		
	}

		
public static void main(String[] args) {

	//Generamos el log
	
	try {
		log = Logger.getLogger("Juego-LoggerdeLvl");
		Handler h = new FileHandler("Juego.xml");
		//Lo genera en xml para dar mas informacion
		log.addHandler(h);
		log.setLevel(Level.FINEST);
		h.setLevel(Level.FINEST); //El log registrara todos los niveles
		//de prioridad para descativarlo hay que cambiar el level a OFF 
		
		
		//Este es el que gener� el Log en txt
		//log = new PrintStream(new FileOutputStream("Juego.log", true));
	} catch (Exception e1) {
	}
	log.log(Level.INFO, "Inicio de la app " + (new Date()));
	
	
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

