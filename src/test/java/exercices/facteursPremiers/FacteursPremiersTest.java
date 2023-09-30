package exercices.facteursPremiers;

/*
L'instruction : import org.junit.jupiter.api.*     inclut (pour notre code) :
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
public class FacteursPremiersTest {
    private List<Integer> actualFacteurs ;
    private List<Integer> expectedFacteurs ;

    private List<Integer> listeFab(int... composants) {
        List<Integer> listeARetourner = new ArrayList<Integer>();
        for (int i : composants)
        {
            listeARetourner.add(i);
        }
        return listeARetourner;
    }
    @BeforeEach
    void setUp() {
        actualFacteurs = new ArrayList<Integer>();
        expectedFacteurs = new ArrayList<Integer>();
    }
    @AfterEach
    void tearDown() {
        actualFacteurs = null;
        expectedFacteurs = null;
    }
    @Test
    void generate_1_devrait_retourner_1_liste_vide() {
        // GIVEN
        expectedFacteurs = listeFab();

        // WHEN
        actualFacteurs = FacteursPremiers.generate(1);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_2_devrait_retourner_liste_contenant_2() {
        // GIVEN
        expectedFacteurs = listeFab(2);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(2);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }
    @Test
    void generate_3_devrait_retourner_liste_contenant_3() {
        // GIVEN
        expectedFacteurs = listeFab(3);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(3);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }
    @Test
    void generate_4_devrait_retourner_liste_contenant_2_2() {
        // GIVEN
        expectedFacteurs = listeFab(2,2);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(4);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }
    @Test
    void generate_6_devrait_retourner_liste_contenant_2_3() {
        // GIVEN
        expectedFacteurs = listeFab(2,3);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(6);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }
    @Test
    void generate_8_devrait_retourner_liste_contenant_2_2_2() {
        // GIVEN
        expectedFacteurs = listeFab(2,2,2);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(8);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }
}
