

public class Gen1{
    static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    static void gen1(StringBuilder gen, int n) {
        if (n == gen.length()) {
            System.out.println(gen.toString());
            return;
        }
        for (char letter : alphabet) {
            gen.setCharAt(n, letter);
            gen1(gen, n + 1);
        }
    }
    public static void main(String[] args) {
        StringBuilder gn = new StringBuilder();
        for (int length = 2; length <= 5; length++) {
            gn.setLength(length);
            gen1(gn, 0);
        }
    }
}

