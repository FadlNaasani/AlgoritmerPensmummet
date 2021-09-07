package DataStucture;

import java.util.NoSuchElementException;

public class Tabell {

        private Tabell(){}

        public static int max(int[] a, int from, int to) {
            int maxindex = from;
            int maxvalue = a[from];

            for (int i = from + 1; i < to; i++) {
                if (a[i] > maxvalue) {
                    maxindex = i;
                    maxvalue = a[i];
                }
            }
            return maxindex;
        }

        public static int min(int[] a, int from, int to) {
            int minindex = from;
            int minvalue = a[from];

            for (int i = from + 1; i < to; i++) {
                if (a[i] < minvalue) {
                    minindex = i;
                    minvalue = a[i];
                }
            }
            return minindex;
        }
    public static void fratilKontroll(int tabellengde, int fra, int til) {

        if (tabefllengde == 0) {
            throw new IllegalArgumentException("Tabellengden er null");
        }

        if (fra < 0) {
            throw new ArrayIndexOutOfBoundsException("fra(" + fra + ") er negativ!");
        }

        if (til > tabellengde) {
            throw new ArrayIndexOutOfBoundsException("til(" + til + ") > tablengde(" + tabellengde + ")");
        }

        if (fra > til) {
            throw new ArrayIndexOutOfBoundsException("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
        }

        if (fra == til) {
            throw new NoSuchElementException("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");
        }
    }

        public static int tournament(int[] a, int begin, int end) {
            for (int i = begin; i > 0; --i) {
                int left = 2 * i;
                int right = 2 * i + 1;
                if (a[left] > a[right]) {
                    a[i] = a[left];
                } else {
                    a[i] = a[right];
                }
            }
            return a[1];
        }
        public static void bytt(int[] a, int i, int j)
        {
            int temp = a[i]; a[i] = a[j]; a[j] = temp;
        }


        public static long fak(int a){
            if(a <= 1) {
                return 1;
            }

            return a * fak(a-1);
        }

        public static void snu(int[] a, int v, int h)  // snur intervallet a[v:h]
        {
            while (v < h) bytt(a, v++, h--);
        }

        public static void snu(int[] a, int v)  // snur fra og med v og ut tabellen
        {
            snu(a, v, a.length - 1);
        }

        public static void snu(int[] a)  // snur hele tabellen
        {
            snu(a, 0, a.length - 1);
        }
    public static boolean nestePermutasjon(int[] a)
    {
        int i = a.length - 2;                    // i starter nest bakerst
        while (i >= 0 && a[i] > a[i + 1]) i--;   // går mot venstre. i tillegg kan while fungere flere ganger
        if (i < 0) return false;                 // a = {n, n-1, . . . , 2, 1}

        int j = a.length - 1;                    // j starter bakerst
        while (a[j] < a[i]) j--;                 // stopper når a[j] > a[i]
        bytt(a,i,j); snu(a,i + 1);               // bytter og snur

        return true;                             // en ny permutasjon
    }
    public static void utvalgssortering(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++) // Utvalgt sortering
            bytt(a, i, min(a, i, a.length));  // to hjelpemetoder
    }
    public static void skriv(int[] a, int fra, int til) {
        for (int i = fra; i <= til; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void skriv(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void skrivln(int[] a, int fra, int til) {
        skriv(a, fra, til);
        System.out.println();
    }

    public static void skrivln(int[] a) {
        skriv(a);
        System.out.println();
    }
}


