import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Guzergah {
    private Havalimani baslangicHavalimani; 
    private Havalimani bitisHavalimani;
    private Gun olusturulmaTarihi;     
    private List<Ucus> ucuslar;         
    private List<UcusRezervasyonu> rezervasyonlar; 

    public Guzergah(Havalimani baslangicHavalimani, Havalimani bitisHavalimani, Gun olusturulmaTarihi, List<Ucus> ucuslar) {
        this.baslangicHavalimani = baslangicHavalimani;
        this.bitisHavalimani = bitisHavalimani;
        this.olusturulmaTarihi = olusturulmaTarihi;
        this.ucuslar = ucuslar;
        this.rezervasyonlar = new ArrayList<>();
    }

   
    public Havalimani getBaslangicHavalimani() {
        return baslangicHavalimani;
    }

    public void setBaslangicHavalimani(Havalimani baslangicHavalimani) {
        this.baslangicHavalimani = baslangicHavalimani;
    }

    public Havalimani getBitisHavalimani() {
        return bitisHavalimani;
    }

    public void setBitisHavalimani(Havalimani bitisHavalimani) {
        this.bitisHavalimani = bitisHavalimani;
    }

    public Gun getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Gun olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public List<Ucus> getUcuslar() {
        return ucuslar;
    }

    public void setUcuslar(List<Ucus> ucuslar) {
        this.ucuslar = ucuslar;
    }

    public List<UcusRezervasyonu> getRezervasyonlar() {
        return rezervasyonlar;
    }

    
    public boolean rezervasyonYap(UcusRezervasyonu rezervasyon) {
        if (rezervasyon != null) {
            rezervasyonlar.add(rezervasyon);
            System.out.println("Rezervasyon başarıyla yapıldı.");
            return true;
        } else {
            System.out.println("Rezervasyon yapılamadı.");
            return false;
        }
    }

    // Ödeme yapma metodu
    public boolean odemeYap(Odeme odeme) {
        if (odeme != null && odeme.islemYap()) {
            System.out.println("Ödeme başarıyla gerçekleştirildi.");
            return true;
        } else {
            System.out.println("Ödeme başarısız.");
            return false;
        }
    }

    
    public List<UcusRezervasyonu> getRezervasyonlar1() {
        return new ArrayList<>(rezervasyonlar); // 
    }
}
