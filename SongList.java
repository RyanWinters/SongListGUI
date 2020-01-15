
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
public class SongList {

	public ArrayList<Song> songList;
	public SongList() 
	{
		songList = new ArrayList<Song>();
	}
	public String addSong(Song song)
	{
		for (int i = 0 ; i < songList.size() ; i++)
		{
			if (song == songList.get(i))
			{
				return ("Song already in list.");
			}
		}
		songList.add(song);
		return "Song added successfully.";
	}
	public String removeSong(int i)
	{
		songList.remove(i);
		return "Song removed successfully.";
	}
	public String clearList()
	{
		songList.clear();
		return "Song list cleared successfully.";
	}
	@Override
	public String toString()
	{
		 int i = 1;
		String result = "There are: " + songList.size() + " songs in this list.\n";
	for (Song song : songList)
		{
		result += (i + ".\n" + song.toString()+ "\n\n");
		i++;
		}
	return result;
	}
	public void saveExit() throws IOException {
		FileOutputStream fout= new FileOutputStream ("songlist.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(songList);
		fout.close();
	}
	//have this to get rid of error message, unsure what it does
	@SuppressWarnings("unchecked")
	public void load() throws IOException, ClassNotFoundException
	{
		FileInputStream fin= new FileInputStream ("songlist.txt");
		ObjectInputStream ois = new ObjectInputStream(fin);
		songList= (ArrayList<Song>)ois.readObject();
		fin.close();
	}
	public Song retrieve(int index) {
		return songList.get(index);
	}
	public int size() {
		// TODO Auto-generated method stub
		return songList.size();
	}
	}
