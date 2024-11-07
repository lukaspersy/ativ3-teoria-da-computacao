import java.util.ArrayList;
import java.util.List;

public class Questao02 {
    public static List<String> gerarCadeias(int N) {
        List<String> cadeias = new ArrayList<>();
        gerarCadeiasRecursivo('S', N, new StringBuilder(), cadeias);
        return cadeias;
    }

    private static void gerarCadeiasRecursivo(char simbolo, int N, StringBuilder cadeiaAtual, List<String> cadeias) {
        if (cadeiaAtual.length() == N) {
            cadeias.add(cadeiaAtual.toString());
            return;
        }

        switch (simbolo) {
            case 'S':
                gerarCadeiasRecursivo('A', N, new StringBuilder(cadeiaAtual).append('a'), cadeias);
                gerarCadeiasRecursivo('B', N, new StringBuilder(cadeiaAtual).append('b'), cadeias);
                if (cadeiaAtual.length() + 1 == N) {
                    cadeias.add(new StringBuilder(cadeiaAtual).append('c').toString());
                }
                break;
            case 'A':
                gerarCadeiasRecursivo('A', N, new StringBuilder(cadeiaAtual).append('a'), cadeias);
                break;
            case 'B':
                gerarCadeiasRecursivo('B', N, new StringBuilder(cadeiaAtual).append('b'), cadeias);
                break;
        }
    }

    public static void main(String[] args) {
        int N = 3;
        List<String> cadeias = gerarCadeias(N);
        System.out.println("Cadeias de comprimento " + N + ": " + cadeias);
    }
}
