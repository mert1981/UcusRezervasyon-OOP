public class Havalimani {
    private String ad;
    private String kod;
    private Adres adres;
    private Kisi yonetici;

    public Havalimani(String ad, String kod, Adres adres, Kisi yonetici) {
        this.ad = ad;
        this.kod = kod;
        this.adres = adres;
        this.yonetici = yonetici;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public Kisi getYonetici() {
        return yonetici;
    }

    public void setYonetici(Kisi yonetici) {
        this.yonetici = yonetici;
    }

    @Override
    public String toString() {
        return "Havalimani{" +
                "ad='" + ad + '\'' +
                ", kod='" + kod + '\'' +
                ", adres=" + adres +
                ", yonetici=" + yonetici +
                '}';
    }
}
