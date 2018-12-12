package Clases;

import java.util.ArrayList;

public class Map {
	
	public static Mapa inicializar() 
	{
		
		ArrayList<Integer> map = new ArrayList<Integer>();
		ArrayList<Sala> mapa = new ArrayList<Sala>();
		//Agregamos las salas creaadas a el ArrayList
		for (int i = 0; i < 10; i++) {
			Sala s1 = new Sala();
			mapa.add(s1);
		}
		return new Mapa(map,mapa,"Hey");

	}

	public static void main(String[] args) {
		Mapa m1 = inicializar();
		/*
		ArrayList<Integer> map = new ArrayList<Integer>();
		Sala s1 =new Sala();
		ArrayList<Sala> mapa = new ArrayList<Sala>();
		//Agregamos las salas creaadas a el ArrayList
		mapa.add(s1);
		
		Mapa m1 = new Mapa(map,mapa,"Hey");
		*/System.out.println(m1);
	
	}
}
