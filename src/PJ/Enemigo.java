package PJ;

import javax.swing.ImageIcon;

import Ventanas.Sprites;

public class Enemigo extends Sprites{
	
	public int vida;
	public int danyo;
	public String name;
	public int id;
	public boolean activa;

	
	public Enemigo(TEnemigos tipo) 
	{
		switch(tipo) 
		{
		case ESQUELETO:
			asignar(10,10,"Esqueleto");
			this.dir = "sprites\\Esqueleto.png";
			break;
		case CABALLERO_OSCURO:
			asignar(20,20,"Caballero");
			this.dir = "sprites\\Esqueleto.png";
			break;
		case GOBLIN:
			asignar(15,5,"Goblin");
			this.dir = "sprites\\Esqueleto.png";
			break;
		}
		this.setIcon(new ImageIcon(dir));
		
		
		
	}
	
	private void asignar(int vida,int danyo,String name) 
	{
		this.vida = vida;
		this.danyo = danyo;
		this.name  =name;
	}
	
	public Enemigo() {
		
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDanyo() {
		return danyo;
	}

	public void setDanyo(int danyo) {
		this.danyo = danyo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	@Override
	public String toString() {
		return "Enemigo [vida=" + vida + ", danyo=" + danyo + ", name=" + name + ", id=" + id + ", activa=" + activa
				+ "]";
	}
	
	
}
