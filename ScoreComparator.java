import java.util.Comparator;

public class ScoreComparator implements Comparator<Anime> {
    @Override
    public int compare(Anime a1, Anime a2) {
        if(a1.getScore() == a2.getScore()){
            return a1.compareTo(a2);
        }
        return a1.getScore() - a2.getScore();
    }
}
