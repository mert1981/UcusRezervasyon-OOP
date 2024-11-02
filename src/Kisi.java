
public class Kisi {
    private String ad;
    private Adres adres;  
    private String mail;
    private Gun dogumTarihi;
    protected float maas;

    public Kisi(String ad, Adres adres, String mail, Gun dogumTarihi, float maas) {
        this.ad = ad;
        this.adres = adres;
        this.mail = mail;
        this.dogumTarihi = dogumTarihi;
        this.maas = maas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Gun getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Gun dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Kisi: " + ad + ", Adres: " + adres + ", Mail: " + mail;
    }
}


