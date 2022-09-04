import java.security.SecureRandom;

public class KartDestesi {

    private static final SecureRandom rastgeleSayi = new SecureRandom();
    private static final int kartSayisi = 52;

    private Kart[] deste = new Kart[kartSayisi];
    private int mevcutKart = 0;


    public KartDestesi() {
        String[] numara = {"As", "İkili", "Uclu", "Dortlu", "Besli", "Altili",
                "Yedili", "Sekizli", "Dokuzlu", "Onlu", "Vale", "Kız", "Papaz"};

        String[] tur = {"Kupa", "Sinek", "Karo", "Maca"};

        for (int sayac = 0; sayac < deste.length; sayac++) {
            deste[sayac] = new Kart(numara[sayac % 13], tur[sayac / 13]);
        }
    }

    public void karistir() { // kart numaralarini rastgele dagitan metot

        mevcutKart = 0;

        for (int birinci = 0; birinci < deste.length; birinci++) {
            int ikinci = rastgeleSayi.nextInt(kartSayisi);

            // kart aktarimi
            Kart temp = deste[birinci];
            deste[birinci] = deste[ikinci];
            deste[ikinci] = temp;
        }
    }


    public Kart kartDagit() {
        if (mevcutKart < deste.length) {
            return deste[mevcutKart++]; // dizideki secili karti dondur
        }
        else {
            return null; // tum kartlarin dagitildigini belirtmek icin null dondur
        }
    }
}