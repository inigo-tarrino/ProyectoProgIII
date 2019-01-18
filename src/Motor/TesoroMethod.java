package Motor;

import Clases.Sala;
import PJ.CofreMi;
import PJ.Personaje;

public class TesoroMethod extends Sala {
	
	public TesoroMethod(int nums, Clases.Salas tsala, String descsala)
	{
		super(nums,tsala,descsala);
	}
/*
	public static void respondemi() 
	{
		Tesoro.generarcofres();
		int coin= 0;
		for (CofreMi cofres : Tesoro.cofradia) 
		{
			coin += cofres.loot;
			//System.out.println(coin);
		}
		
		Personaje.monedero += coin;
		
	}
*/
	@Override
	public void responde() {
		
		Tesoro.generarcofres();
		int coin= 0;
		for (CofreMi cofres : Tesoro.cofradia) 
		{
			coin += cofres.loot;
		}
		
		Personaje.monedero += coin;
		System.out.println(Personaje.monedero);
	}
/*
	public static void main(String[] args) {
		respondemi();
		System.out.println(Personaje.monedero);
	}
*/
}
