package PJ;

public class Enemigo {
	
	public int vida;
	public int danyo;
	public String name;
	public int id;
	public boolean activa;
	
	public Enemigo(int vida, int danyo, String name, int id, boolean activa) {
		super();
		this.vida = vida;
		this.danyo = danyo;
		this.name = name;
		this.id = id;
		this.activa = activa;
	}
	
	public Enemigo() {
		super();
		this.vida = 0;
		this.danyo = 0;
		this.name = "Uno por defecto";
		this.id = 0;
		this.activa = false;
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
