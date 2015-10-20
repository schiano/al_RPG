package game;

public abstract class EquipmentFactory extends DecoratorEquipment {

	private EquipmentFactory(Soldier s, int stuff) {
		super(s, stuff);
		// TODO Auto-generated constructor stub
	}

	public static Soldier createSword(Soldier s, int sword)
	{
		if (s.getNbEquipments() <2)
			return new DecoratorSword(s, sword);
		else
			return s;
	}

	public static Soldier createShield(Soldier s, int shield)
	{
		if (s.getNbEquipments() <2)
			return new DecoratorShield(s, shield);
		else
			return s;
	}
}
