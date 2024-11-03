public abstract class Odeme {
	
    private int odemeID;
    private double miktar;
    private Durum durum; 
    

   
    public Odeme(int odemeID, double miktar, Durum durum) {
        this.odemeID = odemeID;
        this.miktar = miktar;
        this.durum = durum;
       
    }

    
    public int getOdemeID() {
        return odemeID;
    }

    public void setOdemeID(int odemeID) {
        this.odemeID = odemeID;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }

  
 


	public boolean islemYap() {
		
		return false;
	}


	
}
