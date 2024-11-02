

public class IslemiKontrlEt extends Odeme {
    private String bankaAdi;  
    private String numarayiKontrolEt; 
  
    public IslemiKontrlEt(int odemeID, double miktar, Durum durum, boolean islemTipi, String bankaAdi, String numarayiKontrolEt) {
        super(odemeID, miktar, durum, islemTipi);
        this.bankaAdi = bankaAdi;
        this.numarayiKontrolEt = numarayiKontrolEt;
    }

   
    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getNumarayiKontrolEt() {
        return numarayiKontrolEt;
    }

    public void setNumarayiKontrolEt(String numarayiKontrolEt) {
        this.numarayiKontrolEt = numarayiKontrolEt;
    }

    @Override
    public String toString() {
        return "IslemKontrolEt{" +
                "bankaAdi='" + bankaAdi + '\'' +
                ", numarayiKontrolEt='" + numarayiKontrolEt + '\'' +
                ", odemeID=" + getOdemeID() +
                ", miktar=" + getMiktar() +
                ", durum=" + getDurum() +
                ", islemTipi=" + isIslemTipi() +
                '}';
    }
}
