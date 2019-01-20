package Motor;

import java.util.ArrayList;

import Clases.Sala;
import PJ.Enemigo;
import PJ.Personaje;
import PJ.TEnemigos;
import Ventanas.VentanaComp;

//Metodo sala de combate
public class CombateMethod extends Sala
{
	ArrayList<Enemigo> enemigos; 
	public boolean atacausu; //true atacaas tu, false atacan ellos
	private int atacaenemigo;//Num de cual ataca
	
	
	public CombateMethod(int nums, Clases.Salas tsala, String descsala)
	{
		super(nums,tsala,descsala);
		
		genenemigos();
		if(Math.random()< 0.5) 
		{
			atacausu = true;
		}
		else 
		{
			atacausu = false;
		}
		atacaenemigo=0;
	}
	
	@Override
	public void responde() //Ataque del enemigo
	{

			atacaenemigo++;
			if(atacaenemigo>= enemigos.size() ) 
			{
				int dmg= 0;
				for(Enemigo e : enemigos) 
				{
					dmg += e.danyo;
				}
				atacaenemigo =0;
				Personaje.hp -= dmg;
			}
		}
		
		
		
	
	public void combateene() 
	{
		
	}
	
	private void genenemigos() 
	{
		enemigos = new ArrayList<>();
        int numEnemigos = (int) (Math.random()*4)+1;
        for(int j = 0; j < numEnemigos; j++) {
            Enemigo e = new Enemigo(TEnemigos.ESQUELETO);
            double random = Math.random();
            int tiposEnemigo = TEnemigos.values().length;
            double inc = 1.0/tiposEnemigo;
            for(int i = 0; i < tiposEnemigo; i++) {
                if(random < (i+1)*inc) {
                    e = new Enemigo(TEnemigos.values()[i]);
                    break;
                }
            }
            enemigos.add(e);
        }
	}
	public ArrayList<Enemigo> getEnemigos() 
	{
		return this.enemigos;
	}
}
