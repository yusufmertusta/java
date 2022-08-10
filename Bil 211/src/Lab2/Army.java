package Lab2;

public class Army implements Human {

	int totalhealth;
	int totaldamage;
	Human[] humanarray = new Human[10];

	public Army(Human[] Humans) {
		humanarray = Humans;
		calHealth();
		calDamage();
	}

	public int calHealth() {
		for (int i = 0; i < humanarray.length; i++) {
			totalhealth += humanarray[i].getHealth();
		}
		return totalhealth;
	}

	public int calDamage() {
		for (int i = 0; i < humanarray.length; i++) {
			totaldamage += humanarray[i].getDamage();
		}
		return totaldamage;
	}

	public void totalDamage() {
		System.out.println(totaldamage);
	}

	public void totalHealth() {
		if (totalhealth < 0)
			System.out.println(0);
		else {
			System.out.println(totalhealth);
		}
	}

	public void attack(Army army) {
		army.totalhealth = army.totalhealth - this.totaldamage;
		this.totalhealth = this.totalhealth - army.totaldamage;

	}

	public void addSoldier(Human human) {
		totalhealth = totalhealth + human.getHealth();
		totaldamage = totaldamage + human.getDamage();
	}

	@Override
	public int getHealth() {
		return totalhealth;
	}

	@Override
	public int getDamage() {
		return totaldamage;
	}
}
