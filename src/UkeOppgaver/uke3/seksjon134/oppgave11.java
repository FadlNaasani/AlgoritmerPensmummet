/*La m være posisjonen til den minste i intervallet. Hvis m = i, er ombyttingen unødvendig:

public static void utvalgssortering(int[] a)
        {
        for (int i = 0; i < a.length - 1; i++)
        {
        int m = min(a, i, a.length);  // posisjonen til den minste
        if (m != i) bytt(a, i, m);
        }
        }
        Hvis vi gjør noen små endringer i koden over, vil vi få vite antallet ganger m = i:

public static int utvalgssortering(int[] a)
        {
        int antall = 0;
        for (int i = 0; i < a.length - 1; i++)
        {
        int m = min(a, i, a.length);  // posisjonen til den minste
        if (m != i) bytt(a, i, m);
        else antall++;
        }
        return antall;
        }
        Flg. programbit (med den versjonen av utvalgssortering som står rett over) gir antallet for noen tilfeldige permutasjoner av tallene fra 1 til 10:

        for (int i = 0; i < 10; i++)
        {
        int[] a = Tabell.randPerm(10);
        System.out.print(Tabell.utvalgssortering(a) + " ");
        }
        Ved en kjøring av programbiten ble resultatet slik: 4 4 1 0 3 1 2 0 0 2

        Men resultatet blir forskjellig hver gang. Men hva blir gjennomsnittsverdien? Vi har 10! forskjellige permutasjoner. Det er 9! stykker som har tallet 1 først. Det betyr at i første iterasjon er sannsynligheten 1/10 for at m og i er like. I neste iterasjon vil sannsynligheten være 1/9 for at de er like. Osv. til intervallet inneholder kun to verdier. Da vil sannsynligheten være 1/2. Sammenlagt blir det 1/10 + 1/9 + · · · + 1/2. Dette er lik H10 − 1 = 4861/2520 = 1.93. Med andre ord er gjennomsnittsverdien nær 2.

        Hvis tabellen inneholder tallene fra 1 til n, vil gjennomsnittet bli Hn − 1. I Avsnitt 1.1.6 fant vi at for store n er Hn − 1 ≈ log(n) – 0,423. Hvis n f.eks. er 100 000, vil det bli 11,1. Dette betyr at det overhodet ikke lønner seg å ha testen if (m != i). Den utføres hver gang (n − 1 ganger), men det er svært sjelden at m og i er like.*/