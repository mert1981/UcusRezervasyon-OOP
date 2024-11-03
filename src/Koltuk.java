

public class Koltuk {
	
    private String koltukNo;
    private KoltukTuru koltukTipi;
    private KoltukSinifi koltukSinifi;

    
    public Koltuk(String koltukNo, KoltukTuru koltukTipi, KoltukSinifi koltukSinifi) {
        this.koltukNo = koltukNo;
        this.koltukTipi = koltukTipi;
        this.koltukSinifi = koltukSinifi;
    }

    
    public String getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(String koltukNo) {
        this.koltukNo = koltukNo;
    }

    public KoltukTuru getKoltukTipi() {
        return koltukTipi;
    }

    public void setKoltukTipi(KoltukTuru koltukTipi) {
        this.koltukTipi = koltukTipi;
    }

    public KoltukSinifi getKoltukSinifi() {
        return koltukSinifi;
    }

    public void setKoltukSinifi(KoltukSinifi koltukSinifi) {
        this.koltukSinifi = koltukSinifi;
    }

    @Override
    public String toString() {
        return "Koltuk{" +
                "koltukNo='" + koltukNo + '\'' +
                ", koltukTipi=" + koltukTipi +
                ", koltukSinifi=" + koltukSinifi +
                '}';
    }
}
