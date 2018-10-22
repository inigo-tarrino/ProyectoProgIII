package Clases;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Mapa {

	ArrayList<Integer> map = new ArrayList<Integer>();
	private String nombre;
	
	
	public Mapa(ArrayList<Integer> map, String nombre) {
		super();
		this.map = map;
		this.nombre = nombre;
	}
	public Mapa() {

		this.map = null;
		this.nombre = "Por defecto";
	}

	@Override
	public String toString() {
		return "Mapa [map=" + map + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
}
