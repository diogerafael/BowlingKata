import java.util.Arrays;

public class CalculadoraPontuacaoBoliche {
    int pontuacaoDoJogo(int[] jogadas) {
        return Arrays.stream(jogadas).sum();
    }
}
