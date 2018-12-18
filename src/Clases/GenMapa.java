package Clases;

import java.util.ArrayList;

import Motor.*;

public class GenMapa {
	
	
	public static Mapa inicializar() 
	{
		
		ArrayList<Integer> map = new ArrayList<Integer>();
		ArrayList<Sala> mapa = new ArrayList<Sala>();
		//Agregamos las salas creaadas a el ArrayList
		for (int i = 0; i < 10; i++) {
			//Sala s1 = new Sala(i,Salas.COMBATE," ");
			//mapa.add(s1);
			Sala s;
			double rand = Math.random();
			
			if(rand< 0.25) 
			{
				s= new CombateMethod(i,Salas.COMBATE,"");
			}
			else if(rand< 0.5)
			{
				s= new TesoroMethod(i,Salas.TESORO,"");
			}
			else if(rand<0.75) 
			{
				s= new NadaMethod(i,Salas.NADA,"");
			}
			else 
			{
				s= new TiendaMethod(i,Salas.TIENDA,"");
			}
			mapa.add(s);
		}
		return new Mapa(0, map,mapa,"Hey");

	}
	public static void main(String[] args) {
		Mapa m1 = inicializar();
		System.out.println(m1);
	
	}

}
