package Ventanas;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Clases.GenMapa;
import Clases.Mapa;
import Motor.NadaMethod;

public class VentanaComp extends JFrame {

	private Mapa m1;
	private int sp = 1;
	
	public VentanaComp() 
	{
		//Genera el mapa
		m1 = GenMapa.inicializar(); 
		//Metodo necesario
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		
		//Paneles
		
		JPanel main = new JPanel();
		main.setLayout(new GridLayout(1, 4)); //Divide el panel main en 1 columna y 4 filas
	
		JPanel juego= new JPanel();
//		juego.setBackground(Color.BLACK);
		
		JPanel menu= new JPanel();
		menu.setLayout(new GridLayout(4, 1));
		menu.setBackground(Color.WHITE);
		
		JPanel barra = new JPanel();
		barra.setBackground(Color.YELLOW);
		
		main.add(menu);
		main.add(juego);
		
		
		
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
		JButton Volver = new JButton("<- Volver");
		JButton Inventario = new JButton("Inventario");
		
		Stats.setBackground(Color.WHITE);
		Interactuar.setBackground(Color.WHITE);
		Seguir.setBackground(Color.WHITE);
		Inventario.setBackground(Color.WHITE);
		
		
		menu.add(Stats);
		menu.add(Interactuar);
		menu.add(Seguir);
		menu.add(Volver);
		menu.add(Prueba);
		
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
					j2.setText("Sala de Combate  Sala: "+sp);
					juego.setBackground(Color.CYAN);
					//ImageIcon icon = new ImageIcon(getClass().getResource("Icono.png")); 
					//juego.setBackground(icon);
					System.out.println("Combate responde");
					
				break;
				
				case TIENDA:
					j2.setText("Tienda  Sala: "+sp);
					juego.setBackground(Color.WHITE);
					System.out.println("Tienda responde");
					
				break;
				
				case NADA:
					j2.setText("Sala vacía  Sala: "+sp);
					juego.setBackground(Color.BLACK);
					System.out.println("Nada responde");
					
				break;
				
				case TESORO:
					j2.setText("Sala de Tesoro  Sala: "+sp);
					juego.setBackground(Color.GREEN);
					System.out.println("Tesoro Responde");
					
				break;
				}
			}
		}
		);
		Seguir.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{

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
	}

}
