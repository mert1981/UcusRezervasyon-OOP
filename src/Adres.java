
public class Adres {
    private String sokak;
    private String sehir;
    private String ulke;

    public Adres(String sokak, String sehir, String ulke) {
        this.sokak = sokak;
        this.sehir = sehir;
        this.ulke = ulke;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    @Override
    public String toString() {
        return sokak + ", " + sehir + ", " + ulke;
    }
}
