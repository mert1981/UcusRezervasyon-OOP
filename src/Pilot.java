import java.util.List;

public class Pilot extends Kisi {
    public Pilot(String adSoyad, int gun, int ay, int yil) {
        super(adSoyad, gun, ay, yil);
    }

    @Override
    public String getKategori() {
        return "Pilot";
    }
}