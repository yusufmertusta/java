package Lab2;

public class Archer implements Human {

	int attack, defense;

	public Archer(int attack, int defense) {
		this.attack = attack;
		this.defense = defense;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getDamage() {
		int damage = getAttack() * getAttack();
		return damage;
	}

	public int getHealth() {
		int health = getDefense();
		return health;
	}

	@Override
	public String toString() {
		return "Profession: Archer\r\n" + "Attack:" + getAttack() + "\r" + "Defense:" + getDefense() + "\r" + "Damage:"
				+ getDamage() + "\r" + "Health:" + getHealth();

	}

}
