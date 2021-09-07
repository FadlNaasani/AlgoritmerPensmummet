package MainAndCollection;

import DataStucture.Tabell;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a = {3,1,4,9,7,10,8,6,5,2};        // permutasjon av tallene fra 1 til 10
        Tabell.nestePermutasjon(a);              // lager neste permutasjon
        System.out.println(Arrays.toString(a));  // [3, 1, 4, 9, 8, 2, 5, 6, 7, 10]
    }

    public static void skriv(int[] a, int fra, int til)
    {

            if (til - fra > 0) System.out.print(a[fra]);
            for (int i = fra + 1; i < til; i++) System.out.print(" " + a[i]);
        }

        public static void skriv(int[] a)
        {
            skriv(a, 0, a.length);
    }
}