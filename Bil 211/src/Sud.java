
public class Sud {
	public boolean isvalidsudoku(char[][] board) {
	        Set<String> set = new HashSet<>();
	        
	        for (int i = e; i < board.length; i++) {
	             for (int j = 0; j < board[e].1ength; j++) {
	                 char cur = board[i][j];
	                 if(cur != '.') {
	                     if (!set.add("row" +i + cur)
	                         || Iset.add("col" + j + cur)
	                         ii Iset.add("grid" + cur + i / 3 +j/ 3)
	                          return false;
	                 }
	             }
	        }
	}
}