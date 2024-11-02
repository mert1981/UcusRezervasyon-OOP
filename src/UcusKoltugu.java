

public class UcusKoltugu extends Koltuk {
	
	
    private double ucret;
    private boolean rezerveEdildi;

    
    public UcusKoltugu(String koltukNo, KoltukTipi koltukTipi, KoltukSinifi koltukSinifi, double ucret) {
        super(koltukNo, koltukTipi, koltukSinifi);
        this.ucret = ucret;
        this.rezerveEdildi = false; 
    }

    
    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public boolean isRezerveEdildi() {
        return rezerveEdildi;
    }

    public void setRezerveEdildi(boolean rezerveEdildi) {
        this.rezerveEdildi = rezerveEdildi;
    }

    @Override
    public String toString() {
        return "UcusKoltugu{" +
                "koltukNo='" + getKoltukNo() + '\'' +
                ", koltukTipi=" + getKoltukTipi() +
                ", koltukSinifi=" + getKoltukSinifi() +
                ", ucret=" + ucret +
                ", rezerveEdildi=" + rezerveEdildi +
                '}';
    }
}
