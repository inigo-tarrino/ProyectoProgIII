package PJ;

public class Personaje {

	public int monedero;
	private int hp;
	private int dmg;
	private String nom;

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

}
