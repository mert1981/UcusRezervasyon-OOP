
import java.util.Date;

public class Bildirim {
    protected int bildirimNo;
    protected Date olusturmaZamani;
    protected String icerik;
    protected boolean gonderildi;

    public Bildirim(int bildirimNo, Date olusturmaZamani, String icerik) {
        this.bildirimNo = bildirimNo;
        this.olusturmaZamani = olusturmaZamani;
        this.icerik = icerik;
        this.gonderildi = false;  // Başlangıçta gönderilmedi olarak ayarlanır
    }

    public int getBildirimNo() {
        return bildirimNo;
    }

    public void setBildirimNo(int bildirimNo) {
        this.bildirimNo = bildirimNo;
    }

    public Date getOlusturmaZamani() {
        return olusturmaZamani;
    }

    public void setOlusturmaZamani(Date olusturmaZamani) {
        this.olusturmaZamani = olusturmaZamani;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public boolean isGonderildi() {
        return gonderildi;
    }

    public void setGonderildi(boolean gonderildi) {
        this.gonderildi = gonderildi;
    }

    public void gonder() {
        // Bu metod, alt sınıflarda override edilerek, farklı bildirim tipleri için özelleştirilecektir.
        System.out.println("Bildirim gönderildi: " + icerik);
        this.gonderildi = true;
    }

    @Override
    public String toString() {
        return "Bildirim{" +
                "bildirimNo=" + bildirimNo +
                ", olusturmaZamani=" + olusturmaZamani +
                ", icerik='" + icerik + '\'' +
                ", gonderildi=" + gonderildi +
                '}';
    }
}
