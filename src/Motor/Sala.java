package Motor;

import Clases.Salas;

public class Sala {

	public int id;
	public Salas tipo;
	public int pts;
	
	public Sala(int id, Salas tipo, int pts) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.pts = pts;
	}
	
	public Sala() {
		this.id = 0;
		this.tipo = null;
		this.pts = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Salas getTipo() {
		return tipo;
	}

	public void setTipo(Salas tipo) {
		this.tipo = tipo;
	}

	public int getPts() {
		return pts;
	}

	public void setPts(int pts) {
		this.pts = pts;
	}

	@Override
	public String toString() {
		return "Sala [id=" + id + ", tipo=" + tipo + ", pts=" + pts + "]";
	}
	
	public static void main(String[] args) {
		Sala s1 = new Sala(0, Salas.COMBATE, 10);
		
	}
	
	
}
