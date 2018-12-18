package Motor;

import java.util.ArrayList;

import PJ.CofreMi;
//Seguramente subir al metodo salas especificando que este método se ejecute en las salas
//de tipo tesoro
public class Tesoro {
	static int dado= (int) (Math.random()*3)+1;
	static ArrayList<CofreMi> cofradia = new ArrayList<CofreMi>();
	//CofreMi i;
	/*
	static boolean b= false;
	public static boolean launch(boolean b) 
	{
		int ismimic= (int) (Math.random()*2)+1;
		if(ismimic !=2) 
		{b= false;
		}
		else
		b= true;
		
		return b;
		
	}
	*/
	public static void generarcofres(){
	for (int i = 0; i < dado; i++)
	{	
	
		CofreMi f1  = new CofreMi(10,false,15,0);
		cofradia.add(f1);
		
	
	}
	
	}
	
	public static void main(String[] args) //	Para ver si lo genera
	{
		generarcofres();
		System.out.println(cofradia);
		System.out.println();
	}
}
