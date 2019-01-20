package Ventanas;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Clases.GenMapa;
import Clases.Mapa;
import Motor.CombateMethod;
import Motor.NadaMethod;
import Motor.TiendaMethod;
import Objetos_e_Inventario.Objeto;
import PJ.Enemigo;

public class VentanaComp extends JFrame {

	private Mapa m1;
	private int sp = 1;
	private boolean combate = false;
	private boolean nada = false;
	private boolean tesoro = false;
	private boolean tienda = false;
	private BufferedImage foncombate;
	private BufferedImage fontienda;
	private BufferedImage fonnada;
	private BufferedImage fontesoro;
	
	
	public VentanaComp() 
	{
		try {
			foncombate = ImageIO.read(new File("sprites\\combate.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			fonnada = ImageIO.read(new File("sprites\\nada1.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			fontienda = ImageIO.read(new File("sprites\\descarga.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fontesoro = ImageIO.read(new File("sprites\\tesoro1.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Genera el mapa
		m1 = GenMapa.inicializar(); 
		//Metodo necesario
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		
		//Paneles
		
		JPanel main = new JPanel();
		main.setLayout(new GridLayout(1, 4)); //Divide el panel main en 1 columna y 4 filas
	
		JPanel juego= new JPanel()
		{
			@Override
			protected void paintComponent(Graphics g) {
				if(combate) {
				g.drawImage(foncombate, 0, 0,getWidth(),getHeight(), null);
				}
				if(nada) 
				{
				g.drawImage(fonnada, 0, 0, getWidth(), getHeight(), null);
				}
				if(tienda)
				{
				g.drawImage(fontienda, 0, 0, getWidth(), getHeight(), null);	
				}
				if(tesoro)
				{
				g.drawImage(fontesoro, 0, 0, getWidth(), getHeight(), null);	
				}
			
				}
		};
	//	juego.setLayout(new GridLayout(5, 1));//Arreglar los sprites o dejarlo asi
		
//		juego.setBackground(Color.BLACK);
		
		JPanel menuc= new JPanel();
		
		JPanel menu= new JPanel();
		menu.setLayout(new GridLayout(4, 1));
		menu.setBackground(Color.WHITE);
		
		menu.add(menuc, BorderLayout.SOUTH);
		
		JPanel barra = new JPanel();
		barra.setBackground(Color.YELLOW);
		
		main.add(menu);
		main.add(juego);
		
		JPanel ataques = new JPanel();
		ataques.setBackground(Color.BLUE);
		ataques.setLayout(new GridLayout(3, 1));
		
		
		
		cp.add(barra, BorderLayout.SOUTH);
		cp.add(menu, BorderLayout.WEST);
		
		//Labels = Textos
		
		JLabel j2 = new JLabel("Info de la sala");
		barra.add(j2, BorderLayout.CENTER);
		
		//Botones 
		
		JButton Prueba= new JButton("Haz click");
		JButton Stats= new JButton("Stats");
		JButton Interactuar = new JButton("Interactuar");
		JButton Seguir = new JButton("Seguir ->");
		//JButton Volver = new JButton("<- Volver");
		JButton Inventario = new JButton("Inventario");
		
		JButton S= new JButton("Ataque Suave");
		JButton M= new JButton("Ataque Medio");
		JButton F = new JButton("Ataque Fuerte");
	//	M.setSize(20, 20);
	//	F.setSize(20, 20);
		
		Stats.setBackground(Color.WHITE);
		Interactuar.setBackground(Color.WHITE);
		Seguir.setBackground(Color.WHITE);
		Inventario.setBackground(Color.WHITE);
		
		
		menu.add(Stats);
		menu.add(Interactuar);
		menu.add(Seguir);
		//menu.add(Volver);
		menu.add(Prueba);
		
		ataques.add(S);
		ataques.add(M);
		ataques.add(F);
		
		
		menu.add(Inventario);
		
		//Es dios-método necesario
		cp.add(main);
		
		//Action Listener
		
		Prueba.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Hola");
			}
		}
		);
		Interactuar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				Clases.Sala salas = m1.getSalaactual();
				salas.responde();
				
				switch(salas.getTsala()) 
				{
				case COMBATE:
					if(combate) return;
					combate = true;
					CombateMethod c1 = new CombateMethod(sp, null, " ");
					juego.setBackground(Color.CYAN);
					menuc.add(ataques);
					int i =0;
					//juego.setLayout(GridLayout(2,2));
					//ImageIcon icon = new ImageIcon(getClass().getResource("Icono.png")); 
					//juego.setBackground(icon);
					System.out.println("Combate responde");
					ArrayList<Enemigo> enemigos =  c1.getEnemigos();
					for(Enemigo enemigo : enemigos) 
					{
					
						i ++;
						juego.add(enemigo);
					}
					j2.setText("Sala de Combate  Sala: "+sp+"    "+i+" Enemigos se te aproximan");
				break;
				
				case TIENDA:
					if(tienda) return;
					tienda = true;
					menuc.remove(ataques);
					TiendaMethod c2 = new TiendaMethod(sp, null, " ");
					j2.setText("Tienda  Sala: "+sp);
					juego.setBackground(Color.WHITE);
					System.out.println("Tienda responde");
					ArrayList<Objeto> Invent =  c2.getObjetos();
					System.out.println(Invent);
					
				break;
				
				case NADA:
					if(nada) return;
					nada = true;
					menuc.remove(ataques);
					j2.setText("Sala vacía  Sala: "+sp);
					juego.setBackground(Color.BLACK);
					System.out.println("Nada responde");
					
				break;
				
				case TESORO:
					if(tesoro) return;
					tesoro = true;
					menuc.remove(ataques);
					j2.setText("Sala de Tesoro  Sala: "+sp);
					juego.setBackground(Color.GREEN);
					System.out.println("Tesoro Responde");
					
				break;
				}
			}

			private LayoutManager GridLayout(int i, int j) {
				// TODO Auto-generated method stub
				return null;
			}
		}
		);
		Seguir.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(combate) {
				combate = false;
				}
				if(nada) {
					nada = false;
					}
				if(tesoro) {
					tesoro = false;
					}
				if(tienda) {
					tienda = false;
					}
				juego.removeAll();
				if(!m1.fin())
				{
					sp++;
					boolean fin = m1.actulizar();
					if(fin) 
					{
						j2.setText("Game Over");
						juego.setBackground(Color.BLUE);
						System.out.println("Has salido del mapa");
						JOptionPane.showMessageDialog(rootPane, "OH vaya... parece que te has pasado el primer mapa", "Final", 0);
						//mostrar ventana fin de juego
						
						
					}
					else 
					{
						//Muestra la siguiente sala
						//repintar sala
					}
				}
			}
		}
		);
		Inventario.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				VInventario v1 = new VInventario();
				v1.setSize(1000, 600);
				v1.setVisible(true);
				v1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				v1.setTitle("Inventario");
			}
		}
		);
		/*
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(combate) 
				{
					switch(e.getKeyCode()) 
					{
					case KeyEvent.VK_S:
						System.out.println("Pulsada S");
						System.out.println("Hola ahí");
						break;
					case KeyEvent.VK_M:
						break;
					case KeyEvent.VK_F:
						break;
					}
				}
			}
			 
		});*/
	}
	
}
