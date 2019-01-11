package Ventanas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sprites extends JLabel {
	
	public String dir;
	
	public ImageIcon img;
	public int posx;
	public int posy;
	public Sprites(String dir) 
	{
		super();
		this.dir = dir;
		img = new ImageIcon();
		this.setIcon(img);
	}
	public Sprites() 
	{}
	

}
