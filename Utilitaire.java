import java.util.List;

public class Utilitaire {

    public static boolean verifTri(List<Anime> vAnimes) {
        int i = 1;

        while (i < vAnimes.size() && vAnimes.get(i).compareTo(vAnimes.get(i - 1)) >= 0) {
            i = i + 1;
        }

        return i == vAnimes.size();
    }

    public static void triInsertion(List<Anime> vAnimes) {
        int j;
        Anime animeAPlacer;
        int i = 1;

        while (i < vAnimes.size()) {
            j = i;
            animeAPlacer = vAnimes.get(i);

            while (j > 0 && vAnimes.get(j - 1).compareTo(animeAPlacer) > 0) {
                vAnimes.set(j, vAnimes.get(j - 1));
                j = j - 1;
            }

            vAnimes.set(j, animeAPlacer);
            i = i + 1;
        }
    }

    public static int animeCompleted(List<Anime> vAnimes) {
        int i = 0;
        int count = 0;

        do {
            if (vAnimes.get(i).getStatut().compareTo("Completed") == 0) {
                count++;
            }
            i++;
        } while (i < vAnimes.size());

        return count;
    }
    
    public static int animeDropped(List<Anime> vAnimes) {
        return vAnimes.size() - animeCompleted(vAnimes);
    }

    public static int numberOfEpisodes(List<Anime> vAnimes) {
        int i = 0;
        int nbEpisodes = 0;
        while (i < vAnimes.size()) {
            nbEpisodes += vAnimes.get(i).getProgress();
            i++;
        }

        return nbEpisodes;
    }

    public static float meanScore(List<Anime> vAnimes) {
        int i = 0;
        float sumScore = 0.0f;
        while (i < vAnimes.size()) {
            sumScore += (float) vAnimes.get(i).getScore();
            i++;
        }

        return sumScore/(float)vAnimes.size();
    }


    public static boolean estAnimePresent(List<Anime> vAnimes, String titreAnime) {
        int i = 0;
        while (i < vAnimes.size() && vAnimes.get(i).getAnimeTitle().compareToIgnoreCase(titreAnime) != 0) {
            i++;
        }

        return i < vAnimes.size();

    }
    
    public static boolean rechAnimeDicho(List<Anime> vAnimes, String titreAnime) {
        int min = 0;
        int max = vAnimes.size() - 1;
        int mid = (min + max) / 2;

        while (min <= max && vAnimes.get(mid).getAnimeTitle().compareToIgnoreCase(titreAnime) != 0) {
            if (vAnimes.get(mid).getAnimeTitle().compareToIgnoreCase(titreAnime) < 0) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            mid = (min + max) / 2;
        }
        return min <= max;
    }

    public static int getAnimeScore(List<Anime> vAnimes, String titreAnime) {
        int i = 0;
        int score = -1;
        while (i < vAnimes.size() && vAnimes.get(i).getAnimeTitle().compareToIgnoreCase(titreAnime) != 0) {
            i++;
        }

        if (i == vAnimes.size()) {
            score = -1;
        } else {
            score = vAnimes.get(i).getScore();
        }

        return score;
    }
    
    public static String getAnimeType(List<Anime> vAnimes, String titreAnime) {
        int i = 0;
        String type = "";
        while (i < vAnimes.size() && vAnimes.get(i).getAnimeTitle().compareToIgnoreCase(titreAnime) != 0) {
            i++;
        }

        if (i == vAnimes.size()) {
            type = "NOT EXIST";
        } else {
            type = vAnimes.get(i).getType();
        }

        return type;
    }

    public static int getAnimeNbEpisodes(List<Anime> vAnimes, String titreAnime) {
        int i = 0;
        int nbEpisodes = -1;
        while (i < vAnimes.size() && vAnimes.get(i).getAnimeTitle().compareToIgnoreCase(titreAnime) != 0) {
            i++;
        }

        if (i == vAnimes.size()) {
            nbEpisodes = -1;
        } else {
            nbEpisodes = vAnimes.get(i).getProgress();
        }

        return nbEpisodes;
    }

    public static String getAnimeStatut(List<Anime> vAnimes, String titreAnime) {
        int i = 0;
        String statut = "";
        while (i < vAnimes.size() && vAnimes.get(i).getAnimeTitle().compareToIgnoreCase(titreAnime) != 0) {
            i++;
        }

        if (i == vAnimes.size()) {
            statut = "NONE";
        } else {
            statut = vAnimes.get(i).getStatut();
        }

        return statut;
    }
}
