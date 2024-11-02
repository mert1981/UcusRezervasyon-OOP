import java.sql.Date;

public class PostaBildirimi extends Bildirim {
	
    private Adres adres;

    public PostaBildirimi(int bildirimNo, Date olusturmaZamani, String icerik, Adres adres) {
        super(bildirimNo, olusturmaZamani, icerik);
        this.adres = adres;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public void gonder() {
        System.out.println("Posta bildirimi gönderiliyor...");
        System.out.println("Adres: " + adres);
        System.out.println("İçerik: " + icerik);
        this.gonderildi = true;
    }

    @Override
    public String toString() {
        return "PostaBildirim{" +
                "adres=" + adres +
                ", " + super.toString() +
                '}';
    }
}
