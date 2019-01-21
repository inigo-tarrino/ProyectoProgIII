package Ventanas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Permissions;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		// Personaje.monedero = 100;
	
		JPanel main = new JPanel();
		main.setLayout(new GridLayout(5, 1));
		
		JPanel juego = new JPanel();
		main.add(juego, BorderLayout.SOUTH);
		
		/*
		JLabel bar = new JLabel();
		main.add(bar, BorderLayout.SOUTH);
		
		JLabel j5 = new JLabel("Info de la sala");
		bar.add(j5, BorderLayout.CENTER);
		*/
		JButton a= new JButton("Vendas     Precio: 30");
		JButton s= new JButton("Pan        Precio: 20");
		JButton d= new JButton("Pocima     Precio: 40");
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
				if(Personaje.monedero >= 30)
				{
				Personaje.monedero -=30;
				Personaje.actualizarm();
				vcount++;
				System.out.println(Personaje.monedero);
				}
				else 
				{
					JOptionPane.showMessageDialog(rootPane, "No tienes dinero", "No hay dinero", 0);
				}
			}
		}
		);
		s.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(Personaje.monedero >= 20) 
				{
				Personaje.monedero -=20;
				Personaje.actualizarm();
				pacount++;
				}
				else 
				{
					JOptionPane.showMessageDialog(rootPane, "No tienes dinero", "No hay Dinero", 0);
				}
			}
		}
		);
		
		d.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(Personaje.monedero >= 40) 
				{
				Personaje.monedero -=40;
				Personaje.actualizarm();
				potcount++;
				}
				else 
				{
					JOptionPane.showMessageDialog(rootPane, "No tienes dinero", "No hay Dinero", 0);
				}
			}
		}
		);
		f.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(Personaje.monedero >= 30)
				{	
				Personaje.monedero -=30;	
				Personaje.actualizarm();
				pcount++;
				}
				else 
				{
					JOptionPane.showMessageDialog(rootPane, "No tienes dinero", "No hay dinero", 0);
				}
			}
		}
		);
		Label l1 = new Label("Tu dinero: "+Personaje.monedero);//El que muestre el stock
		juego.add(l1);
	}

	
	public static void main(String[] args) {
		VentanaT v1 = new VentanaT();
		v1.setSize(1000, 600);
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		v1.setTitle("Tienda");
		
	}

}
