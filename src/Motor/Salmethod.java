package Motor;

import Clases.Salas;

public class Salmethod {
	CargaMapa b1 = new CargaMapa();
	
	
	public static void main(String[] args) {
		CargaMapa b1 = new CargaMapa();
		Sala i = new Sala(0, Salas.NADA, 10);
		Sala s2 = new Sala(0, Salas.COMBATE, 10);
		Sala s1 = new Sala(0, Salas.COMBATE, 10);
		
		if(i.getTipo().equals(Salas.COMBATE)) 
		{
			System.out.println("HOLA");
		}
		if(i.getTipo().equals(Salas.NADA)) 
		{
			System.out.println("HEY");
		}
		if(i.getTipo().equals(Salas.TIENDA)) 
		{
			
		}
		if(i.getTipo().equals(Salas.TESORO)) 
		{
			
		}
		System.out.println(b1);
	}
}
