package mangga;

/**
 * Hello world!
 *
 */
public class DriverAlbum 
{
    public static void main( String[] args )
    {
        Song song1 = new Song();
        Song song2 = new Song();
        
        song1.setTitle("Melukis Senja");
        song1.setArtist("Budi Doremi");
        song1.setDuration(240);
        
        song2.setTitle("Photography");
        song2.setArtist("Ed Sheeran");
        song2.setDuration(274);
        
        Album album = new Album();
        album.setTitle("Pernah Hits");
        album.setYear(2021);
        album.setTotalSongs(2);
        album.addSong(song1);
        album.addSong(song2);
        album.displayInfo();
    }
}
