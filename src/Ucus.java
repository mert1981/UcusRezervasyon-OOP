
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Ucus {
    private int ucusNo;
	private int yil;
    private int ay;
    private int gun;
    private String saat;
    private int sure;
    private String kalkisUlke;
    private String kalkisSehir;
    private String kalkisHavalimani;
    private String varisUlke;
    private String varisSehir;
    private String varisHavalimani;
    private int durum; // 1: Belirlendi, 2: Tamamlandi, 3: Iptal
    private static final String DOSYA_YOLU = "src/files/Ucuslar.txt"; // Dosya yolu burada tanımlandı

    public Ucus(int ucusNo, int yil, int ay, int gun, String saat, int sure, String kalkisUlke, String kalkisSehir, 
                String kalkisHavalimani, String varisUlke, String varisSehir, String varisHavalimani, int durum) {
        this.ucusNo = ucusNo;
        this.yil = yil;
        this.ay = ay;
        this.gun = gun;
        this.saat = saat;
        this.sure = sure;
        this.kalkisUlke = kalkisUlke;
        this.kalkisSehir = kalkisSehir;
        this.kalkisHavalimani = kalkisHavalimani;
        this.varisUlke = varisUlke;
        this.varisSehir = varisSehir;
        this.varisHavalimani = varisHavalimani;
        this.durum = durum;
    }
    
    public int getUcusNo() {
		return ucusNo;
	}

	public void setUcusNo(int ucusNo) {
		this.ucusNo = ucusNo;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

	public int getAy() {
		return ay;
	}

	public void setAy(int ay) {
		this.ay = ay;
	}

	public int getGun() {
		return gun;
	}

	public void setGun(int gun) {
		this.gun = gun;
	}

	public String getSaat() {
		return saat;
	}

	public void setSaat(String saat) {
		this.saat = saat;
	}

	public int getSure() {
		return sure;
	}

	public void setSure(int sure) {
		this.sure = sure;
	}

	public String getKalkisUlke() {
		return kalkisUlke;
	}

	public void setKalkisUlke(String kalkisUlke) {
		this.kalkisUlke = kalkisUlke;
	}

	public String getKalkisSehir() {
		return kalkisSehir;
	}

	public void setKalkisSehir(String kalkisSehir) {
		this.kalkisSehir = kalkisSehir;
	}

	public String getKalkisHavalimani() {
		return kalkisHavalimani;
	}

	public void setKalkisHavalimani(String kalkisHavalimani) {
		this.kalkisHavalimani = kalkisHavalimani;
	}

	public String getVarisUlke() {
		return varisUlke;
	}

	public void setVarisUlke(String varisUlke) {
		this.varisUlke = varisUlke;
	}

	public String getVarisSehir() {
		return varisSehir;
	}

	public void setVarisSehir(String varisSehir) {
		this.varisSehir = varisSehir;
	}

	public String getVarisHavalimani() {
		return varisHavalimani;
	}

	public void setVarisHavalimani(String varisHavalimani) {
		this.varisHavalimani = varisHavalimani;
	}

	public int getDurum() {
		return durum;
	}

	public void setDurum(int durum) {
		this.durum = durum;
	}

    @Override
    public String toString() {
        return "Ucus{" +
                "ucusNo=" + ucusNo +
                ", yil=" + yil +
                ", ay=" + ay +
                ", gun=" + gun +
                ", saat='" + saat + '\'' +
                ", sure=" + sure +
                ", kalkisUlke='" + kalkisUlke + '\'' +
                ", kalkisSehir='" + kalkisSehir + '\'' +
                ", kalkisHavalimani='" + kalkisHavalimani + '\'' +
                ", varisUlke='" + varisUlke + '\'' +
                ", varisSehir='" + varisSehir + '\'' +
                ", varisHavalimani='" + varisHavalimani + '\'' +
                ", durum=" + durum +
                '}';
    }
    
    private String getDurumAciklama() {
        switch (durum) {
            case 1: return "Belirlendi";
            case 2: return "Tamamlandı";
            case 3: return "İptal";
            default: return "Bilinmiyor";
        }
    }

    // Dosyadan uçuşları okuyan ve Ucus listesini döndüren metot
    private static List<Ucus> dosyadanUcuslariOku() {
        List<Ucus> ucusListesi = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(DOSYA_YOLU))) {
            String satir;
            br.readLine(); // Başlık satırını atla
            while ((satir = br.readLine()) != null) {
                String[] veriler = satir.split("[,;]");
                int ucusNo = Integer.parseInt(veriler[0].trim());
                int yil = Integer.parseInt(veriler[1].trim());
                int ay = Integer.parseInt(veriler[2].trim());
                int gun = Integer.parseInt(veriler[3].trim());
                String saat = veriler[4].trim();
                int sure = Integer.parseInt(veriler[5].trim());
                String kalkisUlke = veriler[6].trim();
                String kalkisSehir = veriler[7].trim();
                String kalkisHavalimani = veriler[8].trim();
                String varisUlke = veriler[9].trim();
                String varisSehir = veriler[10].trim();
                String varisHavalimani = veriler[11].trim();
                int durum = Integer.parseInt(veriler[12].trim());

                Ucus ucus = new Ucus(ucusNo, yil, ay, gun, saat, sure, kalkisUlke, kalkisSehir, kalkisHavalimani, varisUlke, varisSehir, varisHavalimani, durum);
                ucusListesi.add(ucus);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ucusListesi;
    }

    // Uçuşları listeleyen metot
    public static void listele() {
        List<Ucus> ucusListesi = dosyadanUcuslariOku();

        System.out.printf("%-5s %-10s %-12s %-20s %-20s %-15s %-10s%n", "No", "Tarih", "Saat", "Kalkış Yeri", "Varış Yeri", "Süre", "Durum");
        System.out.println("-------------------------------------------------------------------------------");

        for (Ucus ucus : ucusListesi) {
            String tarih = String.format("%04d-%02d-%02d", ucus.yil, ucus.ay, ucus.gun);
            String kalkisYeri = ucus.kalkisUlke + " - " + ucus.kalkisSehir;
            String varisYeri = ucus.varisUlke + " - " + ucus.varisSehir;
            System.out.printf("%-5d %-10s %-12s %-20s %-20s %-15d %-10s%n", 
                              ucus.ucusNo, tarih, ucus.saat, kalkisYeri, varisYeri, ucus.sure, ucus.getDurumAciklama());
        }
    }
}