package Clases;

import java.util.ArrayList;

public class GestionMapa {


	
	public static void main(String[] args) 
	{
		ArrayList<Integer> mapa = new ArrayList<Integer>();
		Mapa m1 = new Mapa(mapa,"Hey");
		for (int i = 1; i < 21; i++)
		{
			mapa.add(i);
		}
	System.out.println(m1);
	}
}
