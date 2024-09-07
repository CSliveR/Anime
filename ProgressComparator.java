import java.util.Comparator;

public class ProgressComparator implements Comparator<Anime> {
    @Override
    public int compare(Anime a1, Anime a2) {
        if(a1.getProgress() == a2.getProgress()){
           return a1.compareTo(a2);
        }
        return a1.getProgress() - a2.getProgress();
    }
}
