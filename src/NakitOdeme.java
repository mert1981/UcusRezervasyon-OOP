

public class NakitOdeme extends Odeme {
    
	
	private double nakitTeklif; 

    
    public NakitOdeme(int odemeID, double miktar, Durum durum, double nakitTeklif) {
        super(odemeID, miktar, durum);
        this.nakitTeklif = nakitTeklif;
    }

    
    public double getNakitTeklif() {
        return nakitTeklif;
    }

    public void setNakitTeklif(double nakitTeklif) {
        this.nakitTeklif = nakitTeklif;
    }

}
