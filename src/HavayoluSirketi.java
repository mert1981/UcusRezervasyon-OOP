import java.util.ArrayList;
import java.util.List;

public class HavayoluSirketi {
    private String ad;
    private String kod;
    private List<Havalimani> havalimanlari;
    private List<Ucus> ucuslar;

    public HavayoluSirketi(String ad, String kod) {
        this.ad = ad;
        this.kod = kod;
        this.havalimanlari = new ArrayList<>();
        this.ucuslar = new ArrayList<>();
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

    public List<Havalimani> getHavalimanlari() {
        return havalimanlari;
    }

    public List<Ucus> getUcuslar() {
        return ucuslar;
    }

    // Havalimanı CRUD İşlemleri
    public void havalimaniEkle(Havalimani havalimani) {
        havalimanlari.add(havalimani);
        System.out.println("Havalimanı eklendi: " + havalimani.getAd());
    }

    public void havalimaniGuncelle(Havalimani eskiHavalimani, Havalimani yeniHavalimani) {
        int index = havalimanlari.indexOf(eskiHavalimani);
        if (index != -1) {
            havalimanlari.set(index, yeniHavalimani);
            System.out.println("Havalimanı güncellendi: " + yeniHavalimani.getAd());
        }
    }

    public void havalimaniSil(Havalimani havalimani) {
        havalimanlari.remove(havalimani);
        System.out.println("Havalimanı silindi: " + havalimani.getAd());
    }

    // Uçuş CRUD İşlemleri
    public void ucusEkle(Ucus ucus) {
        ucuslar.add(ucus);
        System.out.println("Uçuş eklendi: " + ucus.getUcusNo());
    }

    public void ucusGuncelle(Ucus eskiUcus, Ucus yeniUcus) {
        int index = ucuslar.indexOf(eskiUcus);
        if (index != -1) {
            ucuslar.set(index, yeniUcus);
            System.out.println("Uçuş güncellendi: " + yeniUcus.getUcusNo());
        }
    }

    public void ucusSil(Ucus ucus) {
        ucuslar.remove(ucus);
        System.out.println("Uçuş silindi: " + ucus.getUcusNo());
    }

    @Override
    public String toString() {
        return "HavayoluSirketi{" +
                "ad='" + ad + '\'' +
                ", kod='" + kod + '\'' +
                ", havalimanlari=" + havalimanlari +
                ", ucuslar=" + ucuslar +
                '}';
    }
}
