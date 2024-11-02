import java.util.List;

public class Pilot extends Kisi {
    private List<Ucus> ucuslar;
    private String ucakTipi;
    private float toplamSaat;
    private float temelMaas;

    public Pilot(String ad, Adres adres, String mail, Gun dogumTarihi, float maas, List<Ucus> ucuslar, String ucakTipi, float toplamSaat, float temelMaas) {
        super(ad, adres, mail, dogumTarihi, maas);
        this.ucuslar = ucuslar;
        this.ucakTipi = ucakTipi;
        this.toplamSaat = toplamSaat;
        this.temelMaas = temelMaas;
    }

    public List<Ucus> getUcuslar() {
        return ucuslar;
    }

    public void setUcuslar(List<Ucus> ucuslar) {
        this.ucuslar = ucuslar;
    }

    public String getUcakTipi() {
        return ucakTipi;
    }

    public void setUcakTipi(String ucakTipi) {
        this.ucakTipi = ucakTipi;
    }

    public float getToplamSaat() {
        return toplamSaat;
    }

    public void setToplamSaat(float toplamSaat) {
        this.toplamSaat = toplamSaat;
    }

    public float getTemelMaas() {
        return temelMaas;
    }

    public void setTemelMaas(float temelMaas) {
        this.temelMaas = temelMaas;
    }

    @Override
    public String toString() {
        return "Pilot: " + getAd() + ", Uçak Tipi: " + ucakTipi;
    }
}
