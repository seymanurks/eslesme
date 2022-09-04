public class KartDestesiTest {

    public static void main(String[] args) {

        KartDestesi kartDestesi = new KartDestesi();
        kartDestesi.karistir();

                boolean kartEslesmesi, kartBitti = false;
                int sayac = 1;
                do {
                    if (kartBitti)
                        break;
                    System.out.println("----------------------------------------");
                    System.out.println(sayac++ + ".tur");
                    System.out.println("----------------------------------------");

                    kartEslesmesi = false;
                    do {

                        String kart1 = String.valueOf(kartDestesi.kartDagit());
                        String kart2 = String.valueOf(kartDestesi.kartDagit());

                        if (kart1.equals("null") || kart2.equals("null")) { //eşit mi contains
                            System.err.println("UYARIII!!! Kart destesindeki kagitlar bitti!");
                            kartBitti = true;
                            break;
                        }

                        System.out.println("Oyuncu 1: " + kart1);
                        System.out.println("Oyuncu 2: " + kart2);

                        String kartNumarasi1[] = kart1.split(" ");
                        String kartNumarasi2[] = kart2.split(" ");

                        if (kartNumarasi1[1].equals(kartNumarasi2[1])) {
                            kartEslesmesi = true;
                            System.out.println("Durum: Kart numaralari eslesiyor.");
                            break;
                        } else {
                            System.out.println("Durum: Kart numaralari uyumsuz.");
                        }
                    }
                    while (!kartEslesmesi);
                } while (!kartBitti);
            }
        }