import java.io.Serializable;

public class Song implements Serializable{

	//Have this to get rid of error message, unsure of what it really does
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String artist;
	String title;
	String length;
	String genre;
	int rating;
	public Song (String artist, String title, String length, String genre, int rating)
	{
		this.artist=artist;
		this.title=title;
		this.length=length;
		this.genre=genre;
		this.rating=rating;
	}
	public void changeArtist(String newArtist)
	{
		artist=newArtist;
	}
	public void changeTitle(String newTitle)
	{
		title=newTitle;
	}
	public void changeLength(String newLength)
	{
		length=newLength;
	}
	public void changeGenre(String newGenre)
	{
		genre=newGenre;
	}
	public void changeRating(int newRating)
	{
		rating=newRating;
	}
	@Override
	public String toString()
	{
		return "Artist: " + artist + " \nTitle: " + title + " \nLength: " + length + " \nGenre: " + genre + " \nRating: " + rating;
	}
}
