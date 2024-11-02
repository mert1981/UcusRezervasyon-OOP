
public class Calisan extends Kisi {
    private String tarifeler;
    
    public Calisan(String ad, Adres adres, String mail, Gun dogumTarihi, float maas, String tarifeler) {
        super(ad, adres, mail, dogumTarihi, maas);
        this.tarifeler = tarifeler;
    }

    public String getTarifeler() {
        return tarifeler;
    }

    public void setTarifeler(String tarifeler) {
        this.tarifeler = tarifeler;
    }

    @Override
    public String toString() {
        return "Çalışan: " + getAd() + ", Tarifeler: " + tarifeler;
    }
}
