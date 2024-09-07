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
        return this.animeTitle;
    }

    public int getScore() {
        return this.score;
    }
    
    public String getType() {
        return this.type;
    }

    public int getProgress() {
        return this.progress;
    }

    public String getStatut() {
        return this.statut;
    }
    
    @Override 
    public int compareTo(Anime a) {
        return this.animeTitle.compareTo(a.animeTitle);
    }
    @Override
    public String toString() {
        return "(" + getAnimeTitle() + " - " + getScore() + " - " + getType() + " - " + getProgress() + ")" + "\n";
    }
}