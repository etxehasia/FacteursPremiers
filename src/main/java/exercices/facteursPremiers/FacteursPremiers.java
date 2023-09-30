package exercices.facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public static List<Integer> generate(int nbre) {
        List <Integer> facteurs = new ArrayList<Integer>();
        while (nbre % 2 ==0) {
            facteurs.add(2);
            nbre = nbre / 2;
        }
        if (nbre > 1) {
            facteurs.add(nbre);
        }
        return facteurs;
    }
}
