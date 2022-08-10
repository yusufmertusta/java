package lab2;

public class Journal extends WritingPiece{

	private Article[] articles;
	private double averageCitations;

	public Journal(String name,Article[] articles,double averageCitations) {
		super(name);
		this.articles=articles;
		this.averageCitations=averageCitations;
	}
	


	private Article[] getArticles() {
		return articles;
	}
	private void setArticles(Article[] articles) {
		this.articles = articles;
	}
	private double getAverageCitations() {
		return averageCitations;
	}
	private void setAverageCitations(double averageCitations) {
		this.averageCitations = averageCitations;
	}
	
}
