package game;

public class Infantryman extends AbstractSoldier{

	public Infantryman() {
		this.strength = 25;
		this.health = 100;
	}
	
	public Infantryman(int hp, int str) {
		super(hp, str);
	}
}
