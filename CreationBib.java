
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class CreationBib {
    public static ArrayList<Anime> lesAnimes() {
        String ligne;
        String animeTitle,type;
        int score, progress;
        ArrayList<Anime> resultat = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Anime.txt"))) {
            while ((ligne = br.readLine()) != null) {
                animeTitle = ligne;
                ligne = br.readLine();
                score = Integer.parseInt(ligne);
                ligne = br.readLine();
                progress = Integer.parseInt(ligne);
                ligne = br.readLine();
                type = ligne;
                
                resultat.add(new Anime(animeTitle,score,type,progress));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultat;
    }
}

    

