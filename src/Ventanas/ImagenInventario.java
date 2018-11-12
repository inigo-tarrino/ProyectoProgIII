package Ventanas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class ImagenInventario extends javax.swing.JPanel {
	private static final long serialVersionUID = 1L;
	
public ImagenInventario() {
	this.setSize(1000, 600);
}
	
	public void paintComponent(Graphics g) {
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("pocima.png"));
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(g);
		
		
	}
	
}
	