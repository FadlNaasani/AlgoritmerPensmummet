package UkeOppgaver.uke3.seksjon136;

import DataStucture.Tabell;

public class binærsøk {
    public static void main(String[] args) {
int [] a = {2,6,4,4,6,7,8,6767};
        binærsøk(a,2,7, 4);

    }

    public static int binærsøk(int[] a, int fra, int til, int verdi)
    {
   // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;  // v og h er intervallets endepunkter

        while (v < h)  // obs. må ha v < h her og ikke v <= h
        {
            int m = (v + h)/2;  // heltallsdivisjon - finner midten

            if (verdi > a[m]) v = m + 1;   // verdi må ligge i a[m+1:h]
            else  h = m;                   // verdi må ligge i a[v:m]
        }
        if (h < v || verdi < a[v]) return -(v + 1);  // ikke funnet
        else if (verdi == a[v]) return v;            // funnet
        else  return -(v + 2);                       // ikke funnet
    }
}
