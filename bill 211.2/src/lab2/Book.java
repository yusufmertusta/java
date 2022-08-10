package lab2;

public class Book extends WritingPiece{
	
	private int numberOfChapters;
	private String author;
	private String genre;
	
	public Book(String name, int wordCount, int numberOfChapters, String author, String genre) {
		super(name, wordCount);
		this.numberOfChapters=numberOfChapters;
		this.author=author;
		this.genre=genre;
	}
	

	private int getNumberOfChapters() {
		return numberOfChapters;
	}
	private void setNumberOfChapters(int numberOfChapters) {
		this.numberOfChapters = numberOfChapters;
	}
	private String getAuthor() {
		return author;
	}
	private void setAuthor(String author) {
		this.author = author;
	}
	private String getGenre() {
		return genre;
	}
	private void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
