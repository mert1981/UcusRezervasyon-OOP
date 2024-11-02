
public class Musteri extends Kisi {
	
    private String yolcuNumarasi;

    public Musteri(String ad, Adres adres, String mail, Gun dogumTarihi, float maas, String yolcuNumarasi) {
        super(ad, adres, mail, dogumTarihi, maas);
        this.yolcuNumarasi = yolcuNumarasi;
    }

    public String getYolcuNumarasi() {
        return yolcuNumarasi;
    }

    public void setYolcuNumarasi(String yolcuNumarasi) {
        this.yolcuNumarasi = yolcuNumarasi;
    }

    @Override
    public String toString() {
        return "Müşteri: " + getAd() + ", Yolcu Numarası: " + yolcuNumarasi;
    }
}
