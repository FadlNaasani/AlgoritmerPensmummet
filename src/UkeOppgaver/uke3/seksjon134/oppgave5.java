package UkeOppgaver.uke3.seksjon134;

public class oppgave5 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        utvalgssortering(a);
    }

    public static void utvalgssortering(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            int m = i;             // indeks til den foreløpig minste
            int  minverdi = a[i];  // verdien til den foreløpig minste. Den starter med en og sammnenligne med alle osv

            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] < minverdi)
                {
                    minverdi = a[j];  // ny minste verdi
                    m = j;            // indeksen til ny minste verdi
                }
            }
            // bytter om a[i] og a[m]
            int temp = a[i];
            a[i] = a[m];
            a[m] = temp;
        }
    }
}
