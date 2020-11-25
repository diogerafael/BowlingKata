import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraPontuacaoBolicheTest {

    @Test
    public void deve_retornar_zero_quando_errar_todas_as_jogadas() {
        //arrange
        var jogadas = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        //act
        var result = new CalculadoraPontuacaoBoliche().pontuacaoDoJogo(jogadas);

        //assert
        assertEquals(0, result);
    }



    @Test
    public void deve_retornar_soma_de_jogo_com_spare() {
        //arrange
        var jogadas = new int[]{0, 0,
                                0, 0,
                                0, 0,
                                0, 0,
                                0, 0,
                                0, 0,
                                0, 0,
                                2, 8,
                                2, 3,
                                0,0};

        //act
        var result = new CalculadoraPontuacaoBoliche().pontuacaoDoJogo(jogadas);

        //assert
        assertEquals(17, result);
    }

    @Test
    public void deve_retornar_soma_de_jogo_com_strike() {
        //arrange
        var jogadas = new int[]{0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                10,
                2, 3,
                0, 0};

        //act
        var result = new CalculadoraPontuacaoBoliche().pontuacaoDoJogo(jogadas);

        //assert
        assertEquals(20, result);
    }


    @Test
    public void deve_retornar_soma_de_jogo_com_strike_e_spare() {
        //arrange
        var jogadas = new int[]{
                1, 4,
                4, 5,
                6, 4,
                5, 5,
                10,
                0, 1,
                7, 3,
                6, 4,
                10,
                2, 8,
                6};

        //act
        var result = new CalculadoraPontuacaoBoliche().pontuacaoDoJogo(jogadas);

        //assert
        assertEquals(133, result);
    }





}


