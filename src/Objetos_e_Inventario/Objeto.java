package Objetos_e_Inventario;

public class Objeto {

	public int precio;
	public TObjeto cosa;
	
	public Objeto(int precio, TObjeto cosa) {
		super();
		this.precio = precio;
		this.cosa = cosa;
	}
	public Objeto() {
		super();
		this.precio = 0;
		this.cosa = null;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public TObjeto getCosa() {
		return cosa;
	}
	public void setCosa(TObjeto cosa) {
		this.cosa = cosa;
	}
	@Override
	public String toString() {
		return "Objeto [Precio=" + precio + ", Tipo=" + cosa + "]";
	}
	
}
