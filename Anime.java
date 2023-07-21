

public class Anime implements Comparable<Anime> {

    private String animeTitle;
    private int score;
    private String type;
    private int progress;
 

    public Anime(String animeTitle, int score, String type, int progress) {
        this.animeTitle = animeTitle;
        this.score = score;
        this.type = type;
        this.progress = progress;
    }

    public String getAnimeTitle() {
        return animeTitle;
    }

    public int getScore() {
        return score;
    }
    
    public String getType() {
        return type;
    }

    public int getProgress() {
        return progress;
    }

    @Override 
    public int compareTo(Anime a) {
        if (this.animeTitle.compareTo(a.animeTitle) < 0) {
            return -1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "(" + getAnimeTitle() + '-' + getScore() + '-' + getType() + '-' + getProgress() + ")";
    }











}