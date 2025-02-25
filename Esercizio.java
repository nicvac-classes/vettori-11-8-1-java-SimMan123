import java.util.*;
import java.lang.Math;

class Program {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static int elimina(int v, int n, int ie) {
        int n;

        n = n - 1;
        for (i = ie; i <= n - 2; i++) {
            v[i] = v[i + 1];
        }
        
        return n;
    }
    
    public static int eliminaDup(int[] v, int n) {
        int n, i, j;
        boolean e;

        for (i = 0; i <= n - 1; i++) {
            j = j + 1;
            while (j < n - 1) {
                if (v[i] == v[j]) {
                    n = elimina(v, n, v[j]);
                } else {
                    j = j + 1;
                }
            }
        }
        
        return n;
    }
    
    public static void riempi(int[] v, int n) {
        int i;

        for (i = 0; i <= n - 1; i++) {
            v[i] = (3 + random.nextInt(7)) * 10;
        }
    }
    
    public static void visualizza(int[] v, int n) {
        int i;

        for (i = 0; i <= n - 1; i++) {
            System.out.println(Integer.toString(i) + ">> " + v[i]);
        }
    }

    public static void main(String[] args) {
        int n, i, j, c, p, k;

        n = input.nextInt();
        int[] v = new int[n];

        riempi(v, n);
        for (i = 0; i <= n - 1; i++) {
            for (j = i + 1; j <= n - 2; j++) {
                if (v[j] < v[i]) {
                    n = elimina(v, n, v[i]);
                }
            }
        }
        n = eliminaDup(v, n);
        for (i = 0; i <= n - 1; i++) {
            visualizza(v, n);
        }
    }
    
}
   