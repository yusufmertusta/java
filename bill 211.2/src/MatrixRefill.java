
public class MatrixRefill {
	public static void main(String[] args) {
		int row = 0, column = 0, a = 0;
		for (int i = 0; i < args[0].length(); i++) {
			if (row == 0 && args[0].charAt(i) == ',') {
				column++;
			}
			if (args[0].charAt(i) == '-') {
				row++;
			}
		}
		String[][] colours = new String[row + 1][column + 1];

		for (int y = 0; y < row + 1; y++) {
			for (int i = 0; i < column + 1; i++) {
				colours[y][i] = "" + args[0].charAt(a);
				a += 2;
			}
		}
		int f1 = Integer.parseInt(args[1].substring(0, 1));
		int s1 = Integer.parseInt(args[1].substring(2));
		String c = "" + args[2];
		String x = colours[f1][s1];
		paint(colours, f1, s1, c, x);
		for (int i = 0; i < row + 1; i++) {
			for (int k = 0; k < column + 1; k++) {
				System.out.print(colours[i][k]);
				if(k!=column) {
					System.out.print("\t");
				}
			}
			System.out.println("\r");
		}
	}

	public static void paint(String[][] arr, int f, int s, String c, String x) {

		if ((f < arr.length + 1 && s < arr[0].length + 1) && (f != -1 && s != -1)) {
			if (!(arr[f][s].equals(c))) {
				arr[f][s] = c;
			}
		}
		if ((f < arr.length && s + 1 < arr[0].length) && (f != -1 && s != -1) && arr[f][s + 1].equals(x)) {
			arr[f][s + 1] = c;
			paint(arr, f, s + 1, c, x);
		}
		if ((f < arr.length && s < arr[0].length) && (f != -1 && s != 0) && arr[f][s - 1].equals(x)) {
			arr[f][s - 1] = c;
			paint(arr, f, s - 1, c, x);
		}
		if ((f + 1 < arr.length && s < arr[0].length) && (f != -1 && s != -1) && arr[f + 1][s].equals(x)) {
			arr[f + 1][s] = c;

			paint(arr, f + 1, s, c, x);
		}
		if ((f < arr.length && s < arr[0].length) && (f != 0 && s != -1) && arr[f - 1][s].equals(x)) {
			arr[f - 1][s] = c;
			paint(arr, f - 1, s, c, x);
		}

	}
}