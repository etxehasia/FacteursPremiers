package exercices.facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public static List<Integer> generate(int nbre) {
        List <Integer> facteurs = new ArrayList<Integer>();
        int candidat = 2;
        while (nbre > 1) {
            // on divise nbre par candidat autant de fois que possible
            while (nbre % candidat == 0) {
                facteurs.add(candidat); // il est forcément premier car on
                    // a déjà divisé par tous les diviseurs de candidat
                nbre = nbre / candidat;
            }
            // on peut maintenant passer au candidat suivant
            candidat ++;
        }
        return facteurs;
    }
}
