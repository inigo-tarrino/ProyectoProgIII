package Clases;

import java.util.ArrayList;

public class Map {

	public static void main(String[] args) {
		ArrayList<Integer> map = new ArrayList<Integer>();
		ArrayList<Sala> mapa = new ArrayList<Sala>();
		Mapa m1 = new Mapa(map,mapa,"Hey");
		System.out.println(m1);
	
	}
}
