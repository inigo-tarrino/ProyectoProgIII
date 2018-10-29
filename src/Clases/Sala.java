package Clases;

public class Sala {

	public int nums; //numero de sala
	public Salas tsala; //tipo de sala
	public String descsala;//Descripcion de la sala
	
	
	
	public Sala(int nums, Clases.Salas tsala, String descsala) {
		//super();
		nums = nums;
		tsala = tsala;
		descsala = descsala;
	}
	public Sala() {
		nums = 0;
		tsala = null;
		descsala = "Por defecto";
	}
	
	
}
