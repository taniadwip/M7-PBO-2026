package StudiKasus3;

public class MathUtils {
    public static int factorial(int n) throws IllegalArgumentException {
        // Pengecekan 1: Bilangan negatif
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak terdefinisi untuk bilangan negatif: " + n);
        }
        // Pengecekan 2: Melebihi kapasitas memori integer (overflow)
        if (n > 16) {
            throw new IllegalArgumentException("Nilai " + n + " terlalu besar, menyebabkan integer overflow (maksimal 16).");
        }

        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }
}
