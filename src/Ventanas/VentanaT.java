package Ventanas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PJ.Personaje;

public class VentanaT extends JFrame {

	public static int vcount=0;
	public static int pcount=0;
	public static int pacount=0;
	public static int potcount=0;
	
	public VentanaT()
	{

		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		
		 vcount=0;
		 pcount=0;
		 pacount=0;
		 potcount=0;
		 
		JPanel main = new JPanel();
		main.setLayout(new GridLayout(5, 1));
		
		JPanel juego = new JPanel();
		main.add(juego, BorderLayout.SOUTH);
		JButton b1 = new JButton("Hola");//El que muestre el stock
		juego.add(b1);
		/*
		JLabel bar = new JLabel();
		main.add(bar, BorderLayout.SOUTH);
		
		JLabel j5 = new JLabel("Info de la sala");
		bar.add(j5, BorderLayout.CENTER);
		*/
		JButton a= new JButton("Vendas     Precio: 10");
		JButton s= new JButton("Pan        Precio: 7");
		JButton d= new JButton("Pocima     Precio: 20");
		JButton f= new JButton("Armadura   Precio: 30");
		
		main.add(a);
		main.add(s);
		main.add(d);
		main.add(f);

		
		cp.add(main);
		
		a.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				vcount++;
			}
		}
		);
		s.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(Personaje.monedero >= 20)
				pacount++;
			}
		}
		);
		
		d.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				potcount++;
			}
		}
		);
		f.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				pcount++;
			}
		}
		);
		
	}

	
	public static void main(String[] args) {
		VentanaT v1 = new VentanaT();
		v1.setSize(1000, 600);
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setTitle("Inventario");
		
	}

}
