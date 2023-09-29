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
        expectedFacteurs = new ArrayList<Integer>();

        // WHEN
        actualFacteurs = FacteursPremiers.generate(1);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_2_devrait_retourner_liste_contenant_2() {
        // GIVEN
        expectedFacteurs = new ArrayList<Integer>();
        expectedFacteurs.add(2);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(2);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }
}
