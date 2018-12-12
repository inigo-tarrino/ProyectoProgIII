package Objetos_e_Inventario;

import java.util.Arrays;

public class Inventario {

	Objeto [] Inventario = new Objeto[10];

	public Inventario(Objeto[] inventario) {
		super();
		Inventario = inventario;
	} 
	public Inventario() {
		super();
		Inventario = null;
	}
	public Objeto[] getInventario() {
		return Inventario;
	}
	public void setInventario(Objeto[] inventario) {
		Inventario = inventario;
	}
	@Override
	public String toString() {
		return "Inventario [Inventario=" + Arrays.toString(Inventario) + "]";
	} 
	
}
