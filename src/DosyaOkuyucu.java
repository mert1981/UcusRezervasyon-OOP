
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DosyaOkuyucu {
    public static List<String[]> dosyaOku(String dosyaYolu, String ayirici) {
        List<String[]> satirlar = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            br.readLine(); // Başlık satırını atla
            while ((satir = br.readLine()) != null) {
                String[] veriler = satir.split(ayirici);
                satirlar.add(veriler);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return satirlar;
    }
}
