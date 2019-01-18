package Motor;

import java.util.ArrayList;

import Clases.Sala;
import Clases.Salas;
import Objetos_e_Inventario.Objeto;
import PJ.Enemigo;

public class TiendaMethod extends Sala {
	ArrayList<Objeto> Inv; 

	public TiendaMethod(int nums, Clases.Salas tsala, String descsala)
	{
		super(nums,tsala,descsala);
	}
	public static Tienda genobj() 
	{
		//int i= (int) ((Math.random()+1)*10);

		//Objeto [] InventarioT = new Objeto[i];
		ArrayList<Objeto> Inv = new ArrayList<Objeto>();
		for (int j = 0; j < 10; j++) 
		{
			Objeto ob;
			double rand = Math.random();

			if(rand< 0.2) 
			{
				ob= new Objeto(10, null);
			}
			else if (rand< 0.4) 
			{
				ob= new Objeto(8,null);
			}
			else if(rand< 0.6)
			{
				ob= new Objeto(5,null);
			}
			else if(rand<0.8) 
			{
				ob= new Objeto(20,null);
			}
			else 
			{
				ob= new Objeto(30,null);
			}
			Inv.add(ob);
			
		}
		return new Tienda(1,Inv);

	}
	public ArrayList<Objeto> getObjetos()
	{
		return this.Inv;
	}

	@Override
	public void responde() {

		System.out.println("Bienvenido a mi tienda visitante esto es lo que vendo: ");

	}
	/*
	public static void main(String[] args) 
	{
		Tienda t1 = genobj();
		System.out.println(t1);
	}
	*/
}
