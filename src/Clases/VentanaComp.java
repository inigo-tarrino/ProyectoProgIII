package Clases;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaComp extends JFrame {

	public VentanaComp() 
	{
		//Metodo necesario
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		
		//Paneles
		
		JPanel main = new JPanel();
		main.setLayout(new GridLayout(1, 4)); //Divide el panel main en 1 columna y 4 filas
	
		JPanel juego= new JPanel();
		juego.setBackground(Color.BLACK);
		
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
		
		JLabel j2 = new JLabel("Windowrino");
		barra.add(j2, BorderLayout.CENTER);
		
		//Botones 
		JButton Prueba= new JButton("Haz click");
		JButton Stats= new JButton("Stats");
		JButton Interactuar = new JButton("Interactuar");
		JButton Seguir = new JButton("Seguir ->");
		JButton Inventario = new JButton("Inventario");
		
		Stats.setBackground(Color.WHITE);
		Interactuar.setBackground(Color.WHITE);
		Seguir.setBackground(Color.WHITE);
		Inventario.setBackground(Color.WHITE);
		
		
		menu.add(Stats);
		menu.add(Interactuar);
		menu.add(Seguir);
		menu.add(Prueba);
		
		menu.add(Inventario);
		
		//Es dios-método necesario
		cp.add(main);
		
		//Action Listener
		//Pruebas con hilos
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
				juego.setBackground(Color.BLUE);;
			}
		}
		);
		Seguir.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				j2.setText("Combate");
			}
		}
		);
		
	}

}
