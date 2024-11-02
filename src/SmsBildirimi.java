import java.util.Date;

public class SmsBildirimi extends Bildirim {
	
    private String telNo;

    public SmsBildirimi(int bildirimNo, Date olusturmaZamani, String icerik, String telNo) {
        super(bildirimNo, olusturmaZamani, icerik);
        this.telNo = telNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public void gonder() {
        System.out.println("SMS bildirimi gönderiliyor...");
        System.out.println("Telefon Numarası: " + telNo);
        System.out.println("İçerik: " + icerik);
        this.gonderildi = true;
    }

    @Override
    public String toString() {
        return "SMSBildirim{" +
                "telNo='" + telNo + '\'' +
                ", " + super.toString() +
                '}';
    }
}
