package Motor;

import Clases.Sala;

public class TiendaMethod extends Sala {
 
	public TiendaMethod(int nums, Clases.Salas tsala, String descsala)
	{
		super(nums,tsala,descsala);
	}
	public static void main(String[] args) 
	{
	
	}

	@Override
	public void responde() {
		
		System.out.println("Bienvenido a mi tienda visitante esto es lo que vendo: ");
		
	}
}
