package Ventanas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

	public static void main(String[] args) 
	{
		
		VentanaComp v1 = new VentanaComp();
		v1.setSize(1000, 600);
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setTitle("RogeLike Dungeons");
		
		//Ventana Main
		
		VentanaMain v2= new VentanaMain();
		v2.setSize(100, 600);
		v2.setVisible(true);
	//	v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v2.setTitle("Defecto");
		
		
	
	}
	
}
