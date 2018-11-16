package Motor;

import java.util.ArrayList;

import PJ.CofreMi;
//Seguramente subir al metodo salas especificando que este método se ejecute en las salas
//de tipo tesoro
public class Tesoro {

	static ArrayList<CofreMi> cofradia = new ArrayList<CofreMi>();
	CofreMi i;
	public static void generarcofres(){
	for (int i = 0; i < 10; i++)
	{	
		
		CofreMi f1  = new CofreMi(10, false,15,0);
		cofradia.add(f1);
	
	}
	}
	
	public static void main(String[] args) //	Para ver si lo genera
	{
		generarcofres();
		System.out.println(cofradia);
	}
}
