import java.util.List;

public class Yonetici extends Kisi {
    public Yonetici(String adSoyad, int gun, int ay, int yil) {
        super(adSoyad, gun, ay, yil);
    }

    @Override
    public String getKategori() {
        return "Yonetici";
    }
    

    
}

