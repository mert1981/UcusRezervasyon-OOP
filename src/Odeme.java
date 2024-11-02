
public class Odeme {

	private double tutar;
    private String odemeYontemi;
    private String odemeDurumu;

    public Odeme(double tutar, String odemeYontemi) {
        this.tutar = tutar;
        this.odemeYontemi = odemeYontemi;
        this.odemeDurumu = "Beklemede";
    }

    public void odemeIsle() {
        // Ödeme işleme kodları burada
        this.odemeDurumu = "Tamamlandı";
    }

    // Getter ve Setter'lar
    public String getOdemeDurumu() { 
    	return odemeDurumu; 
    	}

}
