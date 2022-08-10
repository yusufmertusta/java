import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args) {
		solve(0);
	}

	static boolean solve(int x) {
		Scanner input = new Scanner(System.in);
		String sudoku = input.nextLine();
		int count = 0;
		
		for (int i = 0; i < 31; i++) {
			if (sudoku.charAt(i) == 'X')
				count++;
		}
		if (count == 0) {
			System.out.println("Solvable!");	
			return true;
		}

		if (sudoku.charAt(x)!='X')
			return solve(x+2);
		
		
		for(int c=0;c<31;c+=2) {
			if(sudoku.charAt(c)=='X') {
				for(int s=1;s<5;s++) {
					if(c==0)
						if(s != sudoku.charAt(2))
							if(s != sudoku.charAt(4))
								if(s != sudoku.charAt(6))
									if(s != sudoku.charAt(8))
										if(s != sudoku.charAt(16))
											if(s != sudoku.charAt(24))
												if(s != sudoku.charAt(10)) {
													return solve(x+2);
												}
					if(c==2)	
						if(s != sudoku.charAt(0))
							if(s != sudoku.charAt(4))
								if(s != sudoku.charAt(6))
									if(s != sudoku.charAt(10))
										if(s != sudoku.charAt(18))
											if(s != sudoku.charAt(26))
												if(s != sudoku.charAt(8)) {
													return solve(x+2);
												}
					if(c==4)
						if(s != sudoku.charAt(0))
							if(s != sudoku.charAt(2))
								if(s != sudoku.charAt(6))
									if(s != sudoku.charAt(12))
										if(s != sudoku.charAt(20))
											if(s != sudoku.charAt(28))
												if(s != sudoku.charAt(14)) {
													return solve(x+2);	
												}
					if(c==6)
						if(s != sudoku.charAt(0))
							if(s != sudoku.charAt(2))
								if(s != sudoku.charAt(4))
									if(s != sudoku.charAt(14))
										if(s != sudoku.charAt(22))
											if(s != sudoku.charAt(30))
												if(s != sudoku.charAt(12)) {
													return solve(x+2);
												}
					if(c==8)
						if(s != sudoku.charAt(10))
							if(s != sudoku.charAt(12))
								if(s != sudoku.charAt(14))
									if(s != sudoku.charAt(0))
										if(s != sudoku.charAt(16))
											if(s != sudoku.charAt(24))
												if(s != sudoku.charAt(2)) {
													return solve(x+2);
												}
					if(c==10)
						if(s != sudoku.charAt(8))
							if(s != sudoku.charAt(12))
								if(s != sudoku.charAt(14))
									if(s != sudoku.charAt(2))
										if(s != sudoku.charAt(18))
											if(s != sudoku.charAt(26))
												if(s != sudoku.charAt(0)) {
													return solve(x+2);
												}
					if(c==12)
						if(s != sudoku.charAt(8))
							if(s != sudoku.charAt(10))
								if(s != sudoku.charAt(14))
									if(s != sudoku.charAt(4))
										if(s != sudoku.charAt(20))
											if(s != sudoku.charAt(28))
												if(s != sudoku.charAt(6)) {
													return solve(x+2);
												}
					if(c==14)
						if(s != sudoku.charAt(8))
							if(s != sudoku.charAt(10))
								if(s != sudoku.charAt(12))
									if(s != sudoku.charAt(6))
										if(s != sudoku.charAt(22))
											if(s != sudoku.charAt(30))
												if(s != sudoku.charAt(4)) {
													return solve(x+2);
												}
					if(c==16)
						if(s != sudoku.charAt(18))
							if(s != sudoku.charAt(20))
								if(s != sudoku.charAt(22))
									if(s != sudoku.charAt(0))
										if(s != sudoku.charAt(8))
											if(s != sudoku.charAt(24))
												if(s != sudoku.charAt(26)) {
													return solve(x+2);
												}
					if(c==18)
						if(s != sudoku.charAt(16))
							if(s != sudoku.charAt(20))
								if(s != sudoku.charAt(22))
									if(s != sudoku.charAt(2))
										if(s != sudoku.charAt(10))
											if(s != sudoku.charAt(26))
												if(s != sudoku.charAt(24)) {
													return solve(x+2);
												}
					if(c==20)
						if(s != sudoku.charAt(16))
							if(s != sudoku.charAt(18))
								if(s != sudoku.charAt(22))
									if(s != sudoku.charAt(4))
										if(s != sudoku.charAt(12))
											if(s != sudoku.charAt(28))
												if(s != sudoku.charAt(30)) {
													return solve(x+2);
												}
					if(c==22)
						if(s != sudoku.charAt(16))
							if(s != sudoku.charAt(18))
								if(s != sudoku.charAt(20))
									if(s != sudoku.charAt(6))
										if(s != sudoku.charAt(14))
											if(s != sudoku.charAt(30))
												if(s != sudoku.charAt(28)) {
													return solve(x+2);
												}
					if(c==24)
						if(s != sudoku.charAt(26))
							if(s != sudoku.charAt(28))
								if(s != sudoku.charAt(30))
									if(s != sudoku.charAt(0))
										if(s != sudoku.charAt(8))
											if(s != sudoku.charAt(16))
												if(s != sudoku.charAt(18)) {
													return solve(x+2);
												}
					if(c==26)
						if(s != sudoku.charAt(24))
							if(s != sudoku.charAt(28))
								if(s != sudoku.charAt(30))
									if(s != sudoku.charAt(2))
										if(s != sudoku.charAt(10))
											if(s != sudoku.charAt(18))
												if(s != sudoku.charAt(16)) {
													return solve(x+2);
												}
					if(c==28)
						if(s != sudoku.charAt(24))
							if(s != sudoku.charAt(26))
								if(s != sudoku.charAt(30))
									if(s != sudoku.charAt(4))
										if(s != sudoku.charAt(12))
											if(s != sudoku.charAt(20))
												if(s != sudoku.charAt(22)) {
													return solve(x+2);
												}
					if(c==30)
						if(s != sudoku.charAt(24))
							if(s != sudoku.charAt(26))
								if(s != sudoku.charAt(28))
									if(s != sudoku.charAt(6))
										if(s != sudoku.charAt(14))
											if(s != sudoku.charAt(22))
												if(s != sudoku.charAt(20)) {
													return solve(x+2);
												}
						
				}
				System.out.println("Solvable!");
				return true;
			}
			System.out.println("Unsolvable :(");
			return false;
		}
		
		/* 0 - 2,4,6,8,16,24,10    8  - 10,12,14,0,16,24,2  16 - 18,20,22,0,8,24,26   24 - 26,28,30,0,8,16,18      
		   2 - 0,4,6,10,18,26,8    10 - 8,12,14,2,18,26,0   18 - 16,20,22,2,10,26,24  26 - 24,28,30,2,10,18,16
		   4 - 0,2,6,12,20,28,14   12 - 8,10,14,4,20,28,6   20 - 16,18,22,4,12,28,30  28 - 24,26,30,4,12,20,22
		   6 - 0,2,4,14,22,30,12   14 - 8,10,12,6,22,30,4   22 - 16,18,20,6,14,30,28  30 - 24,26,28,6,14,22,20
		                     */
		
	/*	
		1 2 X 3    1  2  X  3    ;    3  X   2  4    ;    4   1   3   2      ; 2   3   4   1
		3 X 2 4    0  2  4  6         8  10  12 14        16  18  20  22       24  26  28  30
		4 1 3 2
		2 3 4 1
	*/	
	
		
		
        return true;
			 
	}

}
