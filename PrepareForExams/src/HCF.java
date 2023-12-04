/**
 * HCF (Highest Common Factor)
 */
public class HCF {

    public static void main(String[] args) {

        int n = 18, m = 27;

        System.out.printf("%d is HCF for %d and %d\n", findHCF(n, m), n, m);

    }


    public static int findHCF(int n, int m) {
        if (m == 0) return n;

        return findHCF(m, n % m);
    }

}
