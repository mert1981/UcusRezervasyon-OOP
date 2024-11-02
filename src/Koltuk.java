
public class Koltuk {

	private String koltukNumarasi;
    private boolean uygun;

    public Koltuk(String koltukNumarasi, boolean uygun) {
        this.koltukNumarasi = koltukNumarasi;
        this.uygun = uygun;
    }

    // Getter ve Setter'lar
    public boolean isUygun() { return uygun; }
    public void setUygun(boolean uygun) { this.uygun = uygun; }
}
