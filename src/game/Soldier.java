package game;

public interface Soldier {
	
	// Return the total strength of a soldier
	public int strike();
	
	// Receive the strike of a soldier
	public void parry(int strike);
	
	public int getHealth();
	
	public int getNbEquipments();
}
