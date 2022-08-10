package lab2;

public class WritingPiece {
	
	private String name;
	private int wordCount; 
	private int estimatedReadingTime;
	private double readingTimeMultiplier;
	
	public WritingPiece(String name, int wordCount) {
		this.name=name;
		this.wordCount=wordCount;
	}
	

	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getWordCount() {
		return wordCount;
	}
	private void setWordCount(int wordCount) {
		wordCount = wordCount;
	}
	private int getEstimatedReadingTime() {
		return (int) Math.ceil(wordCount/200*readingTimeMultiplier);
	}
	private void setEstimatedReadingTime(int estimatedReadingTime) {
		this.estimatedReadingTime = estimatedReadingTime;
	}
	private double getReadingTimeMultiplier() {
		return readingTimeMultiplier;
	}
	private void setReadingTimeMultiplier(double readingTimeMultiplier) {
		this.readingTimeMultiplier = readingTimeMultiplier;
	}
	
}
