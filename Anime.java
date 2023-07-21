
public class Anime implements Comparable<Anime> {

    private String animeTitle;
    private int score;
    private String type;
    private int progress;
    private String statut;
 

    public Anime(String animeTitle, int score, String type, int progress, String statut) {
        this.animeTitle = animeTitle;
        this.score = score;
        this.type = type;
        this.progress = progress;
        this.statut = statut;
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

    public String getStatut() {
        return statut;
    }
    
    @Override 
    public int compareTo(Anime a) {
        if (this.animeTitle.compareTo(a.animeTitle) < 0) {
            return -1;
        } else if (this.animeTitle.compareTo(a.animeTitle) < 0 && this.score == a.score) {
            return 0;
        } else {
            return 1;
        }

    }

    @Override
    public String toString() {
        return "(" + getAnimeTitle() + " - " + getScore() + " - " + getType() + " - " + getProgress() + ")" + "\n";
    }
}