

public class KrediKarti extends Odeme {
    private String kartUzerindekiIsim;  

    
    public KrediKarti(int odemeID, double miktar, Durum durum, boolean islemTipi, String kartUzerindekiIsim) {
        super(odemeID, miktar, durum, islemTipi);
        this.kartUzerindekiIsim = kartUzerindekiIsim;
    }

    
    public String getKartUzerindekiIsim() {
        return kartUzerindekiIsim;
    }

    public void setKartUzerindekiIsim(String kartUzerindekiIsim) {
        this.kartUzerindekiIsim = kartUzerindekiIsim;
    }

    @Override
    public String toString() {
        return "KrediKarti{" +
                "kartUzerindekiIsim='" + kartUzerindekiIsim + '\'' +
                ", odemeID=" + getOdemeID() +
                ", miktar=" + getMiktar() +
                ", durum=" + getDurum() +
                ", islemTipi=" + isIslemTipi() +
                '}';
    }
}
