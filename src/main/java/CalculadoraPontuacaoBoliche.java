public class CalculadoraPontuacaoBoliche {

    private int[] jogadas;
    private int qtdStrike=0;

    int pontuacaoDoJogo(int[] jogadas) {
        this.jogadas = jogadas;
        var resultado = 0;
        for (var indice = 0; indice < jogadas.length; indice++) {
            resultado += jogadas[indice];
            if(ehStrike(indice)){
                resultado += somaBonusStrike(indice);
            } else if (ehSpare(indice)) {
                resultado += somaBonusSpare(indice);
            }
        }
        return resultado;
    }

    private int somaBonusSpare(int indice) {
        return jogadas[indice+2];
    }

    private int somaBonusStrike(int indice) {
        return jogadas[indice+1] + jogadas[indice+2];
    }

    private boolean ehStrike(int indice) {
        if (jogadas[indice] == 10 && ehPrimeiraJogada(indice+qtdStrike)){
            qtdStrike ++;
            return true;
        }else{
            return false;
        }

    }

    private boolean ehSpare(int indice) {
        return ehPrimeiraJogada(indice) && ehUltimoLance(indice, jogadas.length - 2) && ehSoma10(indice);
    }

    private boolean ehSoma10(int indice) {
        return this.jogadas[indice] + this.jogadas[indice + 1] == 10;
    }

    private boolean ehUltimoLance(int indice, int tamanhoArray) {
        return indice < tamanhoArray;
    }

    private boolean ehPrimeiraJogada(int indice) {
        return ehPar(indice);
    }

    private boolean ehPar(int indice) {
        return indice % 2 == 0;
    }

}
