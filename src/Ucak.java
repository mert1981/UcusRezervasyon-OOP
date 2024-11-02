
import java.util.List;

public class Ucak {
    private String tip;
    private int kapasite;
    private int uretimYili;
    private List<Ucus> ucuslar;
    private List<KabinUyesi> kabinUyesi;

    // Yapıcı metod (Constructor)
    public Ucak(String tip, int kapasite, int uretimYili) {
        this.tip = tip;
        this.kapasite = kapasite;
        this.uretimYili = uretimYili;
    }

    // Getter ve Setter metodları
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public List<Ucus> getUcuslar() {
        return ucuslar;
    }

    public void setUcuslar(List<Ucus> ucuslar) {
        this.ucuslar = ucuslar;
    }

    public List<KabinUyesi> getKabinUyesi() {
        return kabinUyesi;
    }

    public void setKabinEkibi(List<KabinUyesi> kabinUyesi) {
        this.kabinUyesi = kabinUyesi;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "tip='" + tip + '\'' +
                ", kapasite=" + kapasite +
                ", uretimYili=" + uretimYili +
                ", ucuslar=" + ucuslar +
                ", kabinEkibi=" + kabinUyesi +
                '}';
    }
}
