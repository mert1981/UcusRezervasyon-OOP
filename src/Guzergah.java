
public class Guzergah {
	
	private Havalimani baslangicHavalimani;
    private Havalimani bitisHavalimani;
    private String olusturmaTarihi;

    public Guzergah(Havalimani baslangicHavalimani, Havalimani bitisHavalimani, String olusturmaTarihi) {
        this.baslangicHavalimani = baslangicHavalimani;
        this.bitisHavalimani = bitisHavalimani;
        this.olusturmaTarihi = olusturmaTarihi;
    }

    // Getter ve Setter'lar
    public String getOlusturmaTarihi() { return olusturmaTarihi; }
}

