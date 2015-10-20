package game;

public abstract class DecoratorEquipment implements Soldier{
	
	protected Soldier s;
	protected int equipment;
	private int nbEquipments;
	
	protected DecoratorEquipment(Soldier s, int stuff){
		this.s=s;
		this.equipment=stuff;
	}
	
	@Override
	public int strike() {
		return s.strike();
	}

	@Override
	public void parry(int strike) {
		s.parry(strike);
	}

	@Override
	public int getHealth() {
		return s.getHealth();
	}
	
	@Override
	public int getNbEquipments() {
		return nbEquipments;
	}
}
