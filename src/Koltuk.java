

public class Koltuk {
	
    private String koltukNo;
    private KoltukTipi koltukTipi;
    private KoltukSinifi koltukSinifi;

    // Yapıcı metod (Constructor)
    public Koltuk(String koltukNo, KoltukTipi koltukTipi, KoltukSinifi koltukSinifi) {
        this.koltukNo = koltukNo;
        this.koltukTipi = koltukTipi;
        this.koltukSinifi = koltukSinifi;
    }

    // Getter ve Setter metodları
    public String getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(String koltukNo) {
        this.koltukNo = koltukNo;
    }

    public KoltukTipi getKoltukTipi() {
        return koltukTipi;
    }

    public void setKoltukTipi(KoltukTipi koltukTipi) {
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
