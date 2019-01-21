package PJ;

import Objetos_e_Inventario.Objeto;

public class Personaje {

	public static int monedero =0;
	public static int hp= 100;
	public static int dmg= 10;
	private String nom;
	private Objeto Inv;
	
	public static void inicializar() 
	{
		monedero =0;
		hp = 100;
		dmg= 10;
	}
	
	public Personaje(int hp, int dmg, String nom,int monedero) {
		super();
		this.monedero = monedero;
		this.hp = hp;
		this.dmg = dmg;
		this.nom = nom;
	}
	
	public Personaje() {
		
		this.monedero = 0;
		this.hp = 0;
		this.dmg = 0;
		this.nom = " ";
	}

	public int getMonedero() {
		return monedero;
	}

	public void setMonedero(int monedero) {
		this.monedero = monedero;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Personaje [hp=" + hp + ", dmg=" + dmg + ", nom=" + nom + "]";
	}
	public static void actualizarm() 
	{
		Personaje.monedero = monedero;
	}
}
