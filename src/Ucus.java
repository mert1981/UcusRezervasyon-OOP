import java.util.Date;

public class Ucus {
    private int ucusNo;
    private Havalimani kalkis;
    private Havalimani varis;
    private Ucak ucak;
    private Gun gun;
    private Saat saat;
    private int kapıNo;
    private Durum durum;

    public Ucus(int ucusNo, Havalimani kalkis, Havalimani varis, Ucak ucak, Gun gun, Saat saat, int kapıNo, Durum durum) {
        this.ucusNo = ucusNo;
        this.kalkis = kalkis;
        this.varis = varis;
        this.ucak = ucak;
        this.gun = gun;
        this.saat = saat;
        this.kapıNo = kapıNo;
        this.durum = durum;
    }

    public int getUcusNo() {
        return ucusNo;
    }

    public void setUcusNo(int ucusNo) {
        this.ucusNo = ucusNo;
    }

    public Havalimani getKalkis() {
        return kalkis;
    }

    public void setKalkis(Havalimani kalkis) {
        this.kalkis = kalkis;
    }

    public Havalimani getVaris() {
        return varis;
    }

    public void setVaris(Havalimani varis) {
        this.varis = varis;
    }

    public Ucak getUcak() {
        return ucak;
    }

    public void setUcak(Ucak ucak) {
        this.ucak = ucak;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public Saat getSaat() {
        return saat;
    }

    public void setSaat(Saat saat) {
        this.saat = saat;
    }

    public int getKapıNo() {
        return kapıNo;
    }

    public void setKapıNo(int kapıNo) {
        this.kapıNo = kapıNo;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }

    // Durum güncelleme metodu
    public void durumGuncelle(Durum yeniDurum) {
        this.durum = yeniDurum;
        System.out.println("Uçuş durumu güncellendi: " + yeniDurum);
    }

    @Override
    public String toString() {
        return "Ucus{" +
                "ucusNo=" + ucusNo +
                ", kalkis=" + kalkis +
                ", varis=" + varis +
                ", ucak=" + ucak +
                ", gun=" + gun +
                ", saat=" + saat +
                ", kapıNo=" + kapıNo +
                ", durum=" + durum +
                '}';
    }
}
