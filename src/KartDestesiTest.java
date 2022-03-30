public class KartDestesiTest {

    public static void main(String[] args) {
        KartDestesi kartDestesi = new KartDestesi();
        kartDestesi.karistir();

        boolean kartEslesmesi, kartBitti=false;
        int sayac = 1;
        do {
            if(kartBitti)
                break;
            System.out.println("----------------------------------------");
            System.out.println(sayac++ + ".tur");
            System.out.println("----------------------------------------");

            kartEslesmesi = false;
            do {

                String kart1 = String.valueOf(kartDestesi.kartDagit());
                String kart2 = String.valueOf(kartDestesi.kartDagit());
                String ad = "Halil";

                if(kart1.contains("null") || kart2.contains("null")){ //eşit mi contains
                    System.err.println("UYARIII!!! Kart destesindeki kagitlar bitti!");
                    kartBitti = true;
                    break;
                }

                System.out.println("Oyuncu 1: " + kart1);
                System.out.println("Oyuncu 2: " + kart2);

                if (kart1.contains(kart2)) {
                    kartEslesmesi = true;
                    System.out.println("Durum: Kart numaralari eslesiyor.");
                    break;
                }
                else {
                    System.out.println("Durum: Kart numaralari uyumsuz.");
                }
            }
            while (!kartEslesmesi);
        }while(!kartBitti);
    }
}