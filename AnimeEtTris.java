
import java.util.ArrayList;
import java.util.Scanner;

public class AnimeEtTris {
    public static void main(String[] args) {
        ArrayList<Anime> mesAnimes = CreationBib.lesAnimes();
        System.out.println("Tri avant:" + Utilitaire.verifTri(mesAnimes));
        Utilitaire.triInsertion(mesAnimes);
        System.out.println(mesAnimes);
        System.out.println("Tri après: " + Utilitaire.verifTri(mesAnimes));
        System.out.println("Mean Score: " + Utilitaire.meanScore(mesAnimes));
        System.out.println("Completed: " + Utilitaire.animeCompleted(mesAnimes));
        System.out.println("Dropped: " + Utilitaire.animeDropped(mesAnimes));
        System.out.println("Episodes: " + Utilitaire.numberOfEpisodes(mesAnimes));
       
        Scanner lecteur = new Scanner(System.in);
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
}
