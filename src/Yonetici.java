
public class Yonetici extends Kisi {
    private String departman;

    public Yonetici(String ad, Adres adres, String mail, Gun dogumTarihi, float maas, String departman) {
        super(ad, adres, mail, dogumTarihi, maas);
        this.departman = departman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public boolean kullaniciEngelle() {
        
        return true;
    }

    public boolean ucusEkle(Ucus ucus) {
        
        return true;
    }

    @Override
    public String toString() {
        return "Yönetici: " + getAd() + ", Departman: " + departman;
    }
}

