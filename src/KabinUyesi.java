
public class KabinUyesi extends Kisi {
    public KabinUyesi(String adSoyad, int gun, int ay, int yil) {
        super(adSoyad, gun, ay, yil);
    }

    @Override
    public String getKategori() {
        return "Kabin Üyesi";
    }
}