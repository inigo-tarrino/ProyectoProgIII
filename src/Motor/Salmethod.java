package Motor;

import Clases.Salas;

public class Salmethod {
	CargaMapa b1 = new CargaMapa();
	
	
	public static void main(String[] args) {
		CargaMapa b1 = new CargaMapa();
		
		for (int i = 0; i < args.length; i++) 
		{
			
		}
		
		Sala j = new Sala(0, Salas.COMBATE, 10);
		
		if(j.getTipo().equals(Salas.COMBATE)) 
		{
			CombateMethod.main(args);	
		}
		if(j.getTipo().equals(Salas.NADA)) 
		{
			NadaMethod.main(args);
		}
		if(j.getTipo().equals(Salas.TIENDA)) 
		{
			TiendaMethod.main(args);
		}
		if(j.getTipo().equals(Salas.TESORO)) 
		{
			TesoroMethod.main(args);
		}
		System.out.println(b1);
	}
}
