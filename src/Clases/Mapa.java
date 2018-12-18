package Clases;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Mapa {

	
	int puntero;
	ArrayList<Integer> map = new ArrayList<Integer>();
	ArrayList<Sala> mapa = new ArrayList<Sala>();
	private String nombre;

	
	public Mapa(int puntero,ArrayList<Integer> map, ArrayList<Sala> mapa, String nombre) {
		super();
		this.puntero=0;
		this.map = map;
		this.mapa = mapa;
		this.nombre = nombre;
		
	}

	public Mapa() {
		this.puntero=0;
		this.map = null;
		this.mapa = mapa;
		
		this.nombre = "";
		
	}
	
	
	@Override
	public String toString() {
		return "Mapa [map=" + map + ", mapa=" + mapa + ", nombre=" + nombre + "]";
	}

	public Sala getSalaactual() 
	{
	if(mapa.size()< puntero) 
	{
		
		System.err.println("");
		return null;
	}	
		return mapa.get(puntero);
		
	}
	//Incrementa el puntero en casa de sobrepasar la longitud 
	//del array no se actualiza
	public boolean actulizar() 
	{
		puntero++;
		if(puntero >= mapa.size()) 
		{
			
			return true;
		}
		return false;
	}
	public boolean fin() {
	if(puntero >= mapa.size()) 
	{
		return true;
	}
	return false;
	}
		}
	
	
	
	
	

