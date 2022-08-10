package lab2;

public class Article extends WritingPiece{


	private	String firstAuthor;
	private int citations;
	
	public Article(String name, int wordCount, String firstAuthor,int citations) {
		super(name, wordCount);
		this.firstAuthor=firstAuthor;
		this.citations=citations;
	}
	
	private String getFirstAuthor() {
		return firstAuthor;
	}
	private void setFirstAuthor(String firstAuthor) {
		this.firstAuthor = firstAuthor;
	}
	private int getCitations() {
		return citations;
	}
	private void setCitations(int citations) {
		this.citations = citations;
	}
	
	
}
