package exercices.facteursPremiers;

/*
L'instruction : import org.junit.jupiter.api.*     inclut (pour notre code) :
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 */
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
public class FacteursPremiersTest {
    @Test
    void generate_1_devrait_retourner_1_liste_vide() {
        // GIVEN
        List<Integer> expectedFacteurs = new ArrayList<Integer>();

        // WHEN
        List<Integer> actualFacteurs = FacteursPremiers.generate(1);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

}
