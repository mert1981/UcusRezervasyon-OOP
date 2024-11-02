public class Odeme {
	
    private int odemeID;
    private double miktar;
    private Durum durum; 
    private boolean islemTipi;  

   
    public Odeme(int odemeID, double miktar, Durum durum, boolean islemTipi) {
        this.odemeID = odemeID;
        this.miktar = miktar;
        this.durum = durum;
        this.islemTipi = islemTipi;
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

    public boolean isIslemTipi() {
        return islemTipi;
    }

    public void setIslemTipi(boolean islemTipi) {
        this.islemTipi = islemTipi;
    }

    @Override
    public String toString() {
        return "Odeme{" +
                "odemeID=" + odemeID +
                ", miktar=" + miktar +
                ", durum=" + durum +
                ", islemTipi=" + islemTipi +
                '}';
    }
}
