package mangga;

public class Album {
    private String title;
    private int year;
    private int track;
    private Song song[];
    
    public void setTitle(String title){
        if (title != null){
            this.title = title;
        }
    };
    public void setYear(int year){
        this.year = year;
    };
    public void setTotalSongs(int total){
        this.track = total;
    };
    public String getTitle(){
        return title;
    };
    public String getYear(){
        return "year";
    };
    public void addSong(Song newSong){
        song[song.length] = newSong;
    };
    public void displayInfo(){
        System.out.println("Album Info");
        System.out.println("Title"+ title);
        System.out.println("Year" + year);
        System.out.println("Song List");
        int i = 0;
        while (i < song.length){
            System.out.println("1. Title   : "+ song[i].getTitle());
            System.out.println("   Artist  : "+ song[i].getArtist());
            System.out.println("   Duration: "+ song[i].getDuration());
            System.out.println("   Category: "+ song[i].play());
            i++;
        }
    };
}
