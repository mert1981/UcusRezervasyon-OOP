import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Ucak {
    private String tip;
    private int kapasite;
    private int uretimYili;
    private static final String DOSYA_YOLU = "src/files/Ucaklar.txt"; // Dosya yolu burada tanımlandı


    public Ucak(String tip, int kapasite, int uretimYili) {
        this.tip = tip;
        this.kapasite = kapasite;
        this.uretimYili = uretimYili;
    }

    public String getTip() {
        return tip;
    }

    public int getKapasite() {
        return kapasite;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "tip='" + tip + '\'' +
                ", kapasite=" + kapasite +
                ", uretimYili=" + uretimYili +
                '}';
    }

    // Dosyadan uçakları okuyan statik metot
    public static List<Ucak> dosyadanUcaklariOku() {
    	 List<Ucak> ucakListesi = new ArrayList<>();

         try (BufferedReader br = new BufferedReader(new FileReader(DOSYA_YOLU))) {
             String satir;
             br.readLine(); // Başlık satırını atla
            while ((satir = br.readLine()) != null) {
                String[] veriler = satir.split(";");
                String tip = veriler[0];
                int kapasite = Integer.parseInt(veriler[1]);
                int uretimYili = Integer.parseInt(veriler[2]);
                
                Ucak ucak = new Ucak(tip, kapasite, uretimYili);
                ucakListesi.add(ucak);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ucakListesi;
    }
    
    public static void listele() {
        List<Ucak> ucakListesi = dosyadanUcaklariOku();

        System.out.printf("%-20s %-10s %-15s%n", "Tip", "Kapasite", "Üretim Yılı");
        System.out.println("---------------------------------------------");

        for (Ucak ucak : ucakListesi) {
            System.out.printf("%-20s %-10d %-15d%n", ucak.tip, ucak.kapasite, ucak.uretimYili);
        }
    }
}