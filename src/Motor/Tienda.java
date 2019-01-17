package Motor;

import java.util.ArrayList;

import Objetos_e_Inventario.Objeto;

public class Tienda {
	private int Stock;
	ArrayList<Objeto> mapa = new ArrayList<Objeto>();
	
	public Tienda(int stock, ArrayList<Objeto> mapa) {
		super();
		Stock = stock;
		this.mapa = mapa;
	}
	
	public Tienda() {
		super();
		Stock = 0;
		this.mapa = null;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public ArrayList<Objeto> getMapa() {
		return mapa;
	}

	public void setMapa(ArrayList<Objeto> mapa) {
		this.mapa = mapa;
	}
	
}
