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
    private static final String AYIRICI = ";";


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

    public static void listele() {
        List<String[]> ucakVerileri = DosyaOkuyucu.dosyaOku(DOSYA_YOLU, AYIRICI);
        System.out.printf("%-20s %-10s %-15s%n", "Tip", "Kapasite", "Üretim Yılı");
        System.out.println("---------------------------------------------");

        for (String[] veriler : ucakVerileri) {
            String tip = veriler[0].trim();
            int kapasite = Integer.parseInt(veriler[1].trim());
            int uretimYili = Integer.parseInt(veriler[2].trim());

            System.out.printf("%-20s %-10d %-15d%n", tip, kapasite, uretimYili);
        }
    }
}