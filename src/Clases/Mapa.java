package Clases;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Mapa {

	

	ArrayList<Integer> map = new ArrayList<Integer>();
	ArrayList<Sala> mapa = new ArrayList<Sala>();
	private String nombre;

	
	public Mapa(ArrayList<Integer> map, ArrayList<Sala> mapa, String nombre) {
		super();
		this.map = map;
		this.mapa = mapa;
		this.nombre = nombre;
		
	}

	public Mapa() {
		super();
		this.map = null;
		this.mapa = null;
		this.nombre = "";
		
	}
	
	
	@Override
	public String toString() {
		return "Mapa [map=" + map + ", mapa=" + mapa + ", nombre=" + nombre + "]";
	}

	public void ItMapa() //Mejor Hacer uso de un ArrayList
	{
		//Mejor un for
		Sala n1 = new Sala();
		Sala n2 = new Sala();
		Sala n3 = new Sala();
		Sala n4 = new Sala();
		Sala n5 = new Sala();
		mapa.add(n1);//Hay que crear cada sala individualmente
		mapa.add(n2);
		mapa.add(n3);
		mapa.add(n4);
		mapa.add(n5);
			
		}
	
	}
	
	
	

