package Motor;

import PJ.Enemigo;

//Metodo sala de combate
public class CombateMethod 
{
	//Crear un enemigo
	
	//implementar el metodo de combate
	
	public void combate() 
	{
		//Crear un enemigo
		Enemigo n1 = new Enemigo();
		
		//implementar el metodo de combate
		//System.out.println("ES una trampa");
		
	}
	public static void main(String[] args) {
		//Crear un enemigo
				boolean centinela = true;
				Enemigo n1 = new Enemigo();
				Enemigo n2 = new Enemigo();
				//implementar el metodo de combate
				System.out.println("Es una trampa");
				do 
				{
					if(n1.getVida()<=0 && n2.getVida()<=0) 
					{
						centinela= false;
					}
					else 
					{
					
					}
					
				}while(centinela = true);
				
	}
}
