import java.util.List;

public class Müsteri extends Kisi {
    public Müsteri(String adSoyad, int gun, int ay, int yil) {
        super(adSoyad, gun, ay, yil);
    }

    @Override
    public String getKategori() {
        return "Müsteri";
    }
    
    public static void listele() {
        System.out.printf("%-20s %-15s %-15s%n", "Ad Soyad", "Doğum Tarihi", "Kategori");
        System.out.println("---------------------------------------------------------");

        // Kisi sınıfındaki listeyi kullanarak yalnızca "Müsteri" kategorisindeki kişileri yazdır
        List<String[]> kisiVerileri = DosyaOkuyucu.dosyaOku("src/files/Kisiler.txt", ";");

        for (String[] veriler : kisiVerileri) {
            String adSoyad = veriler[0].trim();
            int gun = Integer.parseInt(veriler[1].trim());
            int ay = Integer.parseInt(veriler[2].trim());
            int yil = Integer.parseInt(veriler[3].trim());
            String kategori = veriler[4].trim();

            if (kategori.equals("Müsteri")) {
                Müsteri musteri = new Müsteri(adSoyad, gun, ay, yil);
                System.out.println(musteri);
            }
        }
    }
}