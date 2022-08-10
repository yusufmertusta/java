package Lab2;
public class Spearman implements Human {

	int attack, defense;

	public Spearman(int attack, int defense) {
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
		int damage = (getAttack() * 2);
		return damage;
	}

	public int getHealth() {
		int health = (getAttack() + getDefense());
		return health;
	}

	@Override
	public String toString() {
		return "Profession: Spearman\r\n" + "Attack: " + getAttack() + "\r\n" + "Defense: " + getDefense() + "\r\n"
				+ "Damage: " + getDamage() + "\r\n" + "Health: " + getHealth();

	}

}