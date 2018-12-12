package Objetos_e_Inventario;

import java.util.Arrays;

public class InventarioTienda {

	Objeto [] InventarioT = new Objeto[10];

	public InventarioTienda(Objeto[] inventarioT) {
		super();
		InventarioT = inventarioT;
	}
	public InventarioTienda() {
		super();
		InventarioT = null;
	}
	public Objeto[] getInventarioT() {
		return InventarioT;
	}
	public void setInventarioT(Objeto[] inventarioT) {
		InventarioT = inventarioT;
	}
	@Override
	public String toString() {
		return "InventarioTienda [Catálogo=" + Arrays.toString(InventarioT) + "]";
	}
	
}
