package game;

public abstract class AbstractSoldier implements Soldier{
	
	protected int health;
	protected int strength;
	
	public AbstractSoldier() { }
	public AbstractSoldier(int hp, int str)
	{
		health = hp;
		strength = str;
	}
	
	public int getHealth() {
		return health;
	}
	
	@Override
	public int strike() {
		return strength;
	}

	@Override
	public void parry(int strike) {
		health-=strike;
	}
	
	@Override
	public int getNbEquipments() {
		return 0;
	}
}
