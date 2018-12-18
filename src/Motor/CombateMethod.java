package Motor;

import java.util.ArrayList;

import Clases.Sala;
import PJ.Enemigo;

//Metodo sala de combate
public class CombateMethod extends Sala
{
	ArrayList<Enemigo> enemigos; 
	private boolean atacausu; //true atacaas tu, false atacan ellos
	private int atacaenemigo;//Num de cual ataca
	
	
	public CombateMethod(int nums, Clases.Salas tsala, String descsala)
	{
		super(nums,tsala,descsala);
		genenemigos();
		if(Math.random()< 0.5) 
		{
			atacausu = true;
		}
		else 
		{
			atacausu = false;
		}
		atacaenemigo=0;
	}
	
	@Override
	public void responde() //Sistema de turnos implementado
	{
		if(atacausu) 
		{
			//mostrar keybindings
		}
		else 
		{
			atacaenemigo++;
			if(atacaenemigo>= enemigos.size() ) 
			{
				atacaenemigo =0;
			}
		}
		atacausu =!atacausu;
	}
	private void genenemigos() 
	{
	 enemigos = new ArrayList<>();
	 enemigos.add(new Enemigo());
	}
}
