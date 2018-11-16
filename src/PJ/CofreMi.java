package PJ;

public class CofreMi {

	public int loot;
	public boolean esagr;
	public int hp;
	public int dmg;
	int dado= (int) (Math.random()*10)+1;
	
	public CofreMi(int loot, boolean esagr, int hp, int dmg) {
		super();
		this.loot = dado*10;
		this.esagr = esagr;
		this.hp = hp;
		this.dmg = dmg;
	}
	
	public CofreMi() {
		
		this.loot = 0;
		this.esagr = false;
		this.hp = 0;
		this.dmg = 0;
	}

	public int getLoot() {
		return loot;
	}

	public void setLoot(int loot) {
		this.loot = loot;
	}

	public boolean isEsagr() {
		return esagr;
	}

	public void setEsagr(boolean esagr) {
		this.esagr = esagr;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	@Override
	public String toString() {
		return "CofreMi [loot=" + loot + ", esagr=" + esagr + ", hp=" + hp + ", dmg=" + dmg + ", dado=" + dado + "]";
	}
	
	
}
