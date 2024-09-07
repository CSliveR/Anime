import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AnimeEtTris {
    public static void main(String[] args) {
        ArrayList<Anime> mesAnimes = CreationBib.lesAnimes();
        Scanner lecteur = new Scanner(System.in);

        long startTimeT = System.currentTimeMillis();
        //Utilitaire.triInsertion(mesAnimes);
        //System.out.println("Anime trié: " + Utilitaire.verifTri(mesAnimes));


        //Ecriture de la liste d'anime dans un fichier.
        try {
            FileWriter file = new FileWriter("Infos-Animes.txt");

            file.write("Informations sur les anime" + "\n" + "\n");
            file.write("Mean Score: " + Utilitaire.meanScore(mesAnimes) + "\n");
            file.write("Completed: " + Utilitaire.animeCompleted(mesAnimes) + "\n");            
            file.write("Dropped: " + Utilitaire.animeDropped(mesAnimes) + "\n");            
            file.write("Episodes: " + Utilitaire.numberOfEpisodes(mesAnimes) + "\n");       

            file.write("\n");

            file.write("Tri par ordre alphabétique" + "\n");
            Collections.sort(mesAnimes);
            printAnimeList(mesAnimes, file);
            file.write("--------------------------------" + "\n");

            file.write("Tri par nombre d'épisodes" + "\n");
            Collections.sort(mesAnimes, new ProgressComparator());
            printAnimeList(mesAnimes, file);
            file.write("--------------------------------" + "\n");

            file.write("Tri par note des anime" + "\n");
            Collections.sort(mesAnimes, new ScoreComparator());
            printAnimeList(mesAnimes, file);
            file.write("--------------------------------" + "\n");


            file.write("\n");

            long endTimeT = System.currentTimeMillis();
            file.write("votre saisie a été réalisée en : " + (endTimeT-startTimeT) + "ms");
             
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Rechercher un anime.
        System.out.println("Entrez le nom d'un anime");
        String anime = lecteur.nextLine();

        System.out.println(anime + ' ' + "est-il dans la liste ? " +  Utilitaire.estAnimePresent(mesAnimes, anime));
        System.out.println(anime + ' ' + "est-il dans la liste ? " + Utilitaire.rechAnimeDicho(mesAnimes, anime));

        System.out.println("Note de" + " " + anime + ": " + Utilitaire.getAnimeScore(mesAnimes, anime));
        System.out.println("Type de" + " " + anime + ": " + Utilitaire.getAnimeType(mesAnimes, anime));
        System.out.println("Nombre d'épisodes visionnés de " + anime + ": " + Utilitaire.getAnimeNbEpisodes(mesAnimes, anime));
        System.out.println("Statut de" + " " + anime + ": " + Utilitaire.getAnimeStatut(mesAnimes, anime));

        lecteur.close();
    }

    private static void printAnimeList(List<Anime> mesAnimes, FileWriter file){
        for (Anime mesAnime : mesAnimes) {
            try {
                file.write(mesAnime.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
