package game;

public class DecoratorSword extends DecoratorEquipment{

	protected DecoratorSword(Soldier s, int sword) {
		super(s, sword);
	}
	
	@Override
	public int strike() {
		return s.strike() + this.equipment;
	}

}
