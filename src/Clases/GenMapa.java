package Clases;

import java.util.ArrayList;

public class GenMapa {
	
	
	public static Mapa inicializar() 
	{
		
		ArrayList<Integer> map = new ArrayList<Integer>();
		ArrayList<Sala> mapa = new ArrayList<Sala>();
		//Agregamos las salas creaadas a el ArrayList
		for (int i = 0; i < 10; i++) {
			Sala s1 = new Sala(0,Salas.COMBATE," ");
			mapa.add(s1);
		}
		return new Mapa(map,mapa,"Hey");

	}

	public static void main(String[] args) {
		Mapa m1 = inicializar();
		
		System.out.println(m1);
	
	}

}
