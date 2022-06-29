package mangga;

public class Song {
    private String title, artist;
    private int duration;
    
    public void setTitle(String title){
        if (title != null){
            this.title = title;
        }
    };
    public void setArtist(String artist){
        if (artist != null){
            this.artist = artist;
        }
    };
    public void setDuration(int duration){
        if (duration >= 0 && duration <= 300){
            this.duration = duration;
        }
    };
    public String getTitle(){
        return title;
    };
    public String getArtist(){
        return artist;
    };
    public String getDuration(){
        int menit = duration/60;
        int detik = duration % 60;
        if (menit < 10){
            return "0"+String.valueOf(menit)+ ":"+String.valueOf(detik);
        } else {
            return String.valueOf(menit)+ ":"+String.valueOf(detik);
        }
    };
    public String play(){
        if (duration > 0 && duration < 120){
            return "Short";
        } else if (duration >= 120 && duration <= 240){
            return "Intermediate";
        } else {
            return "Long";
        }
    };
}
