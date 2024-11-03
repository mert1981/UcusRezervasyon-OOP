

public class KrediKarti extends Odeme {
	
    private String kartUzerindekiIsim;  

    
    public KrediKarti(int odemeID, double miktar, Durum durum,  String kartUzerindekiIsim) {
        super(odemeID, miktar, durum);
        this.kartUzerindekiIsim = kartUzerindekiIsim;
    }

    
    public String getKartUzerindekiIsim() {
        return kartUzerindekiIsim;
    }

    public void setKartUzerindekiIsim(String kartUzerindekiIsim) {
        this.kartUzerindekiIsim = kartUzerindekiIsim;
    }


	@Override
	public boolean islemYap() {
		
		return false;
	}

  
}
