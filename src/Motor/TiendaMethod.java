package Motor;

import java.util.ArrayList;

import Clases.Sala;
import Clases.Salas;
import Objetos_e_Inventario.Objeto;

public class TiendaMethod extends Sala {

	public TiendaMethod(int nums, Clases.Salas tsala, String descsala)
	{
		super(nums,tsala,descsala);
	}
	public static void genobj() 
	{
		int i= (int) ((Math.random()+1)*10);

		Objeto [] InventarioT = new Objeto[i];
		ArrayList<Objeto> Inv = new ArrayList<Objeto>();
		for (int j = 0; j < InventarioT.length; j++) 
		{
			Objeto ob;
			double rand = Math.random();

			if(rand< 0.25) 
			{
				ob= new Objeto();
			}
			else if(rand< 0.5)
			{
				ob= new Objeto();
			}
			else if(rand<0.75) 
			{
				ob= new Objeto();
			}
			else 
			{
				ob= new Objeto();
			}
			Inv.add(ob);

		}

	}
	
	public static void main(String[] args) 
	{
		System.out.println("");
	}

	@Override
	public void responde() {

		System.out.println("Bienvenido a mi tienda visitante esto es lo que vendo: ");

	}

}
