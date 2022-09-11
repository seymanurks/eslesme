public class Kart {

    private String numara; // ("As", "İkili", ...)
    private String tur; // ("Kupa", "Sinek", "Karo", "Maca")
    private String deneme;

    public Kart (String numara, String tur) {
            this.numara = numara;
            this.tur = tur;
    }

    public String toString() {
        return tur + " " +numara;
    }
}
