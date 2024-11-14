
import java.util.List;

class Ucus {
    private int ucusNo;
    private String tarih;
    private String saat;
    private String kalkisYeri;
    private String kalkisHavalimani;
    private String varisYeri;
    private String varisHavalimani;
    private int sure;
    private String durum;

    private static final String DOSYA_YOLU = "src/files/Ucuslar.txt";
    private static final String AYIRICI = "[,;]";

    public Ucus(int ucusNo, String tarih, String saat, String kalkisYeri, String kalkisHavalimani, String varisYeri, String varisHavalimani, int sure, String durum) {
        this.ucusNo = ucusNo;
        this.tarih = tarih;
        this.saat = saat;
        this.kalkisYeri = kalkisYeri;
        this.kalkisHavalimani = kalkisHavalimani;
        this.varisYeri = varisYeri;
        this.varisHavalimani = varisHavalimani;
        this.sure = sure;
        this.durum = durum;
    }

    public int getUcusNo() {
		return ucusNo;
	}


	public void setUcusNo(int ucusNo) {
		this.ucusNo = ucusNo;
	}


	public String getTarih() {
		return tarih;
	}


	public void setTarih(String tarih) {
		this.tarih = tarih;
	}


	public String getSaat() {
		return saat;
	}


	public void setSaat(String saat) {
		this.saat = saat;
	}


	public String getKalkisYeri() {
		return kalkisYeri;
	}


	public void setKalkisYeri(String kalkisYeri) {
		this.kalkisYeri = kalkisYeri;
	}


	public String getVarisYeri() {
		return varisYeri;
	}


	public void setVarisYeri(String varisYeri) {
		this.varisYeri = varisYeri;
	}


	public int getSure() {
		return sure;
	}


	public void setSure(int sure) {
		this.sure = sure;
	}


	public String getDurum() {
		return durum;
	}


	public void setDurum(String durum) {
		this.durum = durum;
	}


	public static String getDosyaYolu() {
		return DOSYA_YOLU;
	}
	
    // Dosyadan uçuşları listeleyen metot
    public static void listele() {
        List<String[]> ucusVerileri = DosyaOkuyucu.dosyaOku(DOSYA_YOLU, AYIRICI);
        System.out.printf("%-5s %-12s %-8s %-20s %-20s %-10s %-15s %-10s%n", "No", "Tarih", "Saat", "Kalkış Yeri", "Kalkış Havalimanı", "Varış Yeri", "Varış Havalimanı", "Durum");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        for (String[] veriler : ucusVerileri) {
            try {
                int ucusNo = Integer.parseInt(veriler[0].trim());
                String tarih = String.format("%s-%s-%s", veriler[1].trim(), veriler[2].trim(), veriler[3].trim());
                String saat = veriler[4].trim();
                int sure = Integer.parseInt(veriler[5].trim());
                String kalkisYeri = veriler[6].trim() + " - " + veriler[7].trim();
                String kalkisHavalimani = veriler[8].trim();
                String varisYeri = veriler[9].trim() + " - " + veriler[10].trim();
                String varisHavalimani = veriler[11].trim();
                String durum = veriler[12].trim().equals("1") ? "Belirlendi" : veriler[12].trim().equals("2") ? "Tamamlandı" : "İptal";

                // Uçuş bilgilerini estetik olarak yazdır
                System.out.printf("%-5d %-12s %-8s %-20s %-20s %-10s %-15s %-10s%n",
                        ucusNo, tarih, saat, kalkisYeri, kalkisHavalimani, varisYeri, varisHavalimani, durum);

            } catch (Exception e) {
                System.err.println("Hatalı satır: " + String.join(";", veriler));
                e.printStackTrace();
            }
        }
    }
}

