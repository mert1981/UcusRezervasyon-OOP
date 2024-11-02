import java.util.List;

public class KabinUyesi extends Kisi {
    private List<Ucus> ucuslar;
    private float toplamSaat;
    private float temelMaas;

    public KabinUyesi(String ad, Adres adres, String mail, Gun dogumTarihi, float maas, List<Ucus> ucuslar, float toplamSaat, float temelMaas) {
        super(ad, adres, mail, dogumTarihi, maas);
        this.ucuslar = ucuslar;
        this.toplamSaat = toplamSaat;
        this.temelMaas = temelMaas;
    }

    public List<Ucus> getUcuslar() {
        return ucuslar;
    }

    public void setUcuslar(List<Ucus> ucuslar) {
        this.ucuslar = ucuslar;
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
        return "Kabin Üyesi: " + getAd() + ", Mail: " + getMail();
    }
}
