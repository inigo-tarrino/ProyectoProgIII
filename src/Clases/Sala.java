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
	
	
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public Salas getTsala() {
		return tsala;
	}
	public void setTsala(Salas tsala) {
		this.tsala = tsala;
	}
	public String getDescsala() {
		return descsala;
	}
	public void setDescsala(String descsala) {
		this.descsala = descsala;
	}
	@Override
	public String toString() {
		return "Sala [nums=" + nums + ", tsala=" + tsala + ", descsala=" + descsala + "]";
	}
	
}
