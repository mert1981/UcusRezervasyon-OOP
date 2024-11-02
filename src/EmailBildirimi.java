import java.sql.Date;

public class EmailBildirimi extends Bildirim {
	
    private String emailAdresi;

    public EmailBildirimi(int bildirimNo, Date olusturmaZamani, String icerik, String emailAdresi) {
        super(bildirimNo, olusturmaZamani, icerik);
        this.emailAdresi = emailAdresi;
    }

    public String getEmailAdresi() {
        return emailAdresi;
    }

    public void setEmailAdresi(String emailAdresi) {
        this.emailAdresi = emailAdresi;
    }

    @Override
    public void gonder() {
        System.out.println("E-posta bildirimi gönderiliyor...");
        System.out.println("Alıcı: " + emailAdresi);
        System.out.println("İçerik: " + icerik);
        this.gonderildi = true;
    }

    @Override
    public String toString() {
        return "EmailBildirim{" +
                "emailAdresi='" + emailAdresi + '\'' +
                ", " + super.toString() +
                '}';
    }
}
