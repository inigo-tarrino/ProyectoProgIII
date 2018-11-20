package Motor;

import java.util.ArrayList;

import Clases.Salas;

public class CargaMapa {
	
	
	ArrayList <Sala> Map1;
	//Creador de mapas no procedural
	public void llenarmapa() 
	{
		Sala s1 = new Sala(0, Salas.COMBATE, 10);
		Sala s2 = new Sala(0, Salas.NADA, 10);
		Sala s3 = new Sala(0, Salas.COMBATE, 10);
		Sala s4 = new Sala(0, Salas.COMBATE, 10);
		Sala s5 = new Sala(0, Salas.COMBATE, 10);
		Sala s6 = new Sala(0, Salas.COMBATE, 10);
		Sala s7 = new Sala(0, Salas.COMBATE, 10);
		Sala s8 = new Sala(0, Salas.COMBATE, 10);
		Sala s9 = new Sala(0, Salas.COMBATE, 10);
		Sala s10 = new Sala(0, Salas.COMBATE, 10);
		//Llena el array
		
		Map1.add(s1);
		Map1.add(s2);
		Map1.add(s3);
		Map1.add(s4);
		Map1.add(s5);
		Map1.add(s6);
		Map1.add(s7);
		Map1.add(s8);
		Map1.add(s9);
		Map1.add(s10);
		
	}
	public static void main(String[] args) {
		//llenarmapa();
		//System.out.println(Map1);
	}
	
}
