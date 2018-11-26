package Motor;


import java.util.Arrays;

import Clases.Salas;

public class CargaMapa {
	
	static Sala [] Map1;

	
	public CargaMapa(Sala[] map1) {
		super();
		Map1 = map1;
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
		Sala s11 = new Sala(0, Salas.COMBATE, 10);
		Sala s12 = new Sala(0, Salas.COMBATE, 10);
		
		Map1[0]= s1;
		Map1[1]= s2;
		Map1[2]= s3;
		Map1[3]= s4;
		Map1[4]= s5;
		Map1[5]= s6;
		Map1[6]= s7;
		Map1[7]= s8;
		Map1[8]= s9;
		Map1[9]= s10;
		Map1[10]= s11;
		Map1[11]= s12;
	}
	public CargaMapa() 
	{
		Map1 = null;
	
	}
	
	public Sala[] getMap1() {
		return Map1;
	}

	public void setMap1(Sala[] map1) {
		Map1 = map1;
	}
	
	

	//Creador de mapas no procedural
	public static void llenar()
	{
		CargaMapa b1 = new CargaMapa(new Sala[20]);
		
		for (int i = 0; i < Map1.length; i++) {
			Sala s2 = new Sala(0, Salas.NADA, 10);
		}
	}
	@Override
	public String toString() {
		return "CargaMapa [Map1=" + Arrays.toString(Map1) + "]";
	}
	
	/*public static void main(String[] args) {
		
			Sala [] Mapa = new Sala[20];

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
			Sala s11 = new Sala(0, Salas.COMBATE, 10);
			Sala s12 = new Sala(0, Salas.COMBATE, 10);
			//Llena el array
			
			Mapa[0]= s1;
			Mapa[1]= s2;
			Mapa[2]= s3;
			Mapa[3]= s4;
			Mapa[4]= s5;
			Mapa[5]= s6;
			Mapa[6]= s7;
			Mapa[7]= s8;
			Mapa[8]= s9;
			Mapa[9]= s10;
			Mapa[10]= s11;
			Mapa[11]= s12;
			llenar();
		System.out.println(Mapa);
		System.out.println(s1);

		
	}
*/
	}	

