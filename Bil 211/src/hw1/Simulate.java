package hw1;

public class Simulate {
	public static void main(String[] args) {
		int m = 20, n = 20;
//sim¨ulasyon mu (1), interaktif mi (0)?
		int mode = 1;
		int obstacles = 10;
//obstacles kadar engeli, mxn boyutlu gride rastgele yerle¸stirir.
		Environment grid = new Environment(m, n, obstacles, mode);
		int numberOfHunters = 5;
		Creature org;
		for (int i = 0; i < numberOfHunters; i++) {
			org = new Hunter(grid);
//canlıyı bo¸s olan rastgele konuma yerle¸stir.
			grid.putCreature(org);
		}
		int numberOfPreys = 100;
		for (int i = 0; i < numberOfPreys; i++) {
			org = new Prey(grid);
			grid.putCreature(org);
		}
		for (int i = 0; i < 10; i++) {
//Ortama yukarıda bahsedilenden farklı (belki daha zeki)
//davranabilen 10 adet yeni avcı yerle¸stir. Burada tek kısıt,
//yeni tanımlanan avcının da bir Hunter olması.
			org = new UltimateHunter(grid);
			grid.putCreature(org);
		}
		int simulationSteps = 100000;
		for (int i = 0; i < simulationSteps; i++) {
//Simulasyonu bir zaman dilimi ilerlet.
			grid.step();
			if (i % 100 == 0)
//ka¸c av ka¸c avcı kaldı˘gını a¸sa˘gıdaki formatta basar.
//Prey : 34, Hunter : 55, UltimateHunter : 123
				grid.info();
		}
	}
}
