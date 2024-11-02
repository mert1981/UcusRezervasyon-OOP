public class KoltukSinifi extends Koltuk {
    private String sinif;

    
    public KoltukSinifi(String koltukNo, KoltukTipi koltukTipi, KoltukSinifi koltukSinifi, String sinif) {
        super(koltukNo, koltukTipi, koltukSinifi);
        this.sinif = sinif;
    }

    
    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "KoltukSinifi{" +
                "sinif='" + sinif + '\'' +
                ", koltukNo='" + getKoltukNo() + '\'' +
                ", koltukTipi=" + getKoltukTipi() +
                ", koltukSinifi=" + getKoltukSinifi() +
                '}';
    }
}
