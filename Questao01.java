public class Questao01 {
    public static boolean pertenceALinguagem(String cadeia) {
        if (cadeia.isEmpty() || !isUniformString(cadeia)) {
            return false;
        }
        return true;
    }

    private static boolean isUniformString(String cadeia) {
        char firstChar = cadeia.charAt(0);
        for (char c : cadeia.toCharArray()) {
            if (c != firstChar) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Testes
        System.out.println(pertenceALinguagem("aaa")); // true
        System.out.println(pertenceALinguagem("bbb")); // true
        System.out.println(pertenceALinguagem("aab")); // false
        System.out.println(pertenceALinguagem("bba")); // false
        System.out.println(pertenceALinguagem("a"));   // true
        System.out.println(pertenceALinguagem("b"));   // true
    }
}
