package UkeOppgaver.uke3.seksjon135;

public class oppgave3 {



    // vi leter motsatt vei, dvs. starter bakerst
    public static int lineærsøk(int[] a, int verdi)
    {
        if (a.length == 0 || verdi < a[0])
            return -1;  // verdi er mindre enn den største

        int i = a.length - 1; for( ; a[i] > verdi; i--);

        return verdi == a[i] ? i : -(i + 2);
    }


}
