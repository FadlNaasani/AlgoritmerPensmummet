package UkeOppgaver.uke3.seksjon134;

import static DataStucture.Tabell.*;

public class oppgave9 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        utvalgssortering(a,2,5);
    }


    public static void utvalgssortering(int[] a, int fra, int til)
    {
        fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til - 1; i++)
        {
            bytt(a, i, min(a, i, til));  // to hjelpemetoder
        }
    }
}
