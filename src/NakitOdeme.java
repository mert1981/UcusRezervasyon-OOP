

public class NakitOdeme extends Odeme {
    
	
	private double nakitTeklif; 

    
    public NakitOdeme(int odemeID, double miktar, Durum durum, boolean islemTipi, double nakitTeklif) {
        super(odemeID, miktar, durum, islemTipi);
        this.nakitTeklif = nakitTeklif;
    }

    
    public double getNakitTeklif() {
        return nakitTeklif;
    }

    public void setNakitTeklif(double nakitTeklif) {
        this.nakitTeklif = nakitTeklif;
    }

    @Override
    public String toString() {
        return "NakitOdeme{" +
                "nakitTeklif=" + nakitTeklif +
                ", odemeID=" + getOdemeID() +
                ", miktar=" + getMiktar() +
                ", durum=" + getDurum() +
                ", islemTipi=" + isIslemTipi() +
                '}';
    }
}
