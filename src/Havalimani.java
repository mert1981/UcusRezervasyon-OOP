
public class Havalimani {
	
    private String ad;
    private String kod;
    private Konum konum;
    private Kisi yonetici;

    public Havalimani(String ad, String kod, Konum konum, Kisi yonetici) {
        this.ad = ad;
        this.kod = kod;
        this.konum = konum;
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

    public Konum getkonum() {
        return konum;
    }

    public void setAdres(Konum konum) {
        this.konum = konum;
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
                ", adres=" + konum +
                ", yonetici=" + yonetici +
                '}';
    }
}
