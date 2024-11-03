import java.util.List;
import java.util.Map;


public class UcusRezervasyonu {
    private String rezervasyonNo;
    private Ucus ucus;
    private Map<Yolcu, UcusKoltugu> koltuk; 
    private RezervasyonDurumu durum;

    
    public UcusRezervasyonu(String rezervasyonNo, Ucus ucus, Map<Yolcu, UcusKoltugu> koltuk, RezervasyonDurumu durum) {
        this.rezervasyonNo = rezervasyonNo;
        this.ucus = ucus;
        this.koltuk = koltuk;
        this.durum = durum;
    }

    
    public String getRezervasyonNo() {
        return rezervasyonNo;
    }

    public void setRezervasyonNo(String rezervasyonNo) {
        this.rezervasyonNo = rezervasyonNo;
    }

    public Ucus getUcus() {
        return ucus;
    }

    public void setUcus(Ucus ucus) {
        this.ucus = ucus;
    }

    public Map<Yolcu, UcusKoltugu> getKoltuk() {
        return koltuk;
    }

    public void setKoltuk(Map<Yolcu, UcusKoltugu> koltuk) {
        this.koltuk = koltuk;
    }

    public RezervasyonDurumu getDurum() {
        return durum;
    }

    public void setDurum(RezervasyonDurumu durum) {
        this.durum = durum;
    }

    
    public List<Yolcu> getYolcuListesi() {
        return koltuk.keySet().stream().toList();
    }

}
