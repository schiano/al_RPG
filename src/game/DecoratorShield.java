package game;

public class DecoratorShield extends DecoratorEquipment{

	protected DecoratorShield(Soldier s, int shield) {
		super(s, shield);
	}

	@Override
	public void parry(int strike) {
		if (strike < this.equipment)
			return;
		s.parry(strike - this.equipment);
	}

	@Override
	public int getHealth() {
		return s.getHealth();
	}

}
