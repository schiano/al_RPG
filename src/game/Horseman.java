package game;

public class Horseman extends AbstractSoldier{

	public Horseman() {
		this.strength = 50;
		this.health = 150;
	}
	
	public Horseman(int hp, int str) {
		super(hp, str);
	}

}
