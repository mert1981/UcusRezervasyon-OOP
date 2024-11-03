
public class KoltukTuru extends Koltuk {
	
    private String tipi;

   
    public KoltukTuru(String koltukNo, KoltukTuru koltukTipi, KoltukSinifi koltukSinifi, String tipi) {
        super(koltukNo, koltukTipi, koltukSinifi);
        this.tipi = tipi;
    }

    
    public String getTipi() {
        return tipi;
    }

    public void setTipi(String tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "KoltukTipi{" +
                "tipi='" + tipi + '\'' +
                ", koltukNo='" + getKoltukNo() + '\'' +
                ", koltukTipi=" + getKoltukTipi() +
                ", koltukSinifi=" + getKoltukSinifi() +
                '}';
    }
}

