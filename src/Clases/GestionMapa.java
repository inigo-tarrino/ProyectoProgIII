package Clases;

import java.util.ArrayList;

public class GestionMapa {

	public static void main(String[] args) 
	{
		ArrayList<Integer> mapa = new ArrayList<Integer>();
		ArrayList<Sala> mapa2 = new ArrayList<Sala>();
		Mapa m1 = new Mapa(mapa,mapa2, "Hey");
		for (int i = 1; i < 21; i++)
		{
			mapa.add(i);
		}
		for (int i = 0; i < 10; i++) {
			Sala N1  = new Sala();
			mapa2.add(N1);
		}
	System.out.println(m1);

	}
}
