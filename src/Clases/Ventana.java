package Clases;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

	public static void main(String[] args) 
	{
		VentanaComp v1 = new VentanaComp();
		v1.setSize(1000, 600);
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setTitle("RogeLike Dungeons");
		
	
	}
}
