package Lab2;

public class Brute implements Human {

	int attack, defense;

	public Brute(int attack, int defense) {
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
		int damage = ((getAttack() * 2) + getDefense());
		return damage;
	}

	public int getHealth() {
		int health = ((getDefense() * 3) - getAttack());
		return health;
	}

	@Override
	public String toString() {
		return "Profession: Brute\r\n" + "Attack:" + getAttack() + "\r" + "Defense:" + getDefense() + "\r" + "Damage:"
				+ getDamage() + "\r" + "Health:" + getHealth();

	}
}
