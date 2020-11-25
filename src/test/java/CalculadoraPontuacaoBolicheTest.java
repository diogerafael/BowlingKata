import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraPontuacaoBolicheTest {

    @Test
    void deve_retornar_zero_quando_errar_todas_as_jogadas() {
        //arrange
        var jogadas = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        //act
        var result = new CalculadoraPontuacaoBoliche().pontuacaoDoJogo(jogadas);

        //assert
        assertEquals(result, 0);
    }

}


