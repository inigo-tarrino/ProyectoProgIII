package Motor;

import Clases.Sala;

public class NadaMethod extends Sala{

	public NadaMethod(int nums, Clases.Salas tsala, String descsala)
	{
		super(nums,tsala,descsala);
	}
	public static void main(String[] args) 
	{
	
		System.out.println("Aprovecha a curarte");
		
	}
//metodo al cual llamar� el botón interactuar
	@Override
	public void responde() 
	{
		System.out.println("Aqu� no hay nada de valor");
		
	}
}
