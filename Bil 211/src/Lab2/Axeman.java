package Lab2;

public class Axeman implements Human {

	int attack, defense;

	public Axeman(int attack, int defense) {
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
		int damage = (getAttack() + getDefense());
		return damage;
	}

	public int getHealth() {
		int health = (getDefense() * 3);
		return health;
	}

	@Override
	public String toString() {
		return "Profession: Axeman\r\n" + "Attack:" + getAttack() + "\r" + "Defense:" + getDefense() + "\r" + "Damage:"
				+ getDamage() + "\r" + "Health:" + getHealth();

	}
}
