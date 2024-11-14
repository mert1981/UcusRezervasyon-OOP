

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Kisi {
    private String adSoyad;
    private int dogumGunu;
    private int dogumAyi;
    private int dogumYili;
    private String kategori;
    private static final String DOSYA_YOLU = "src/files/Kisiler.txt"; // Dosya yolu burada tanımlandı

    public Kisi(String adSoyad, int dogumGunu, int dogumAyi, int dogumYili, String kategori) {
        this.adSoyad = adSoyad;
        this.dogumGunu = dogumGunu;
        this.dogumAyi = dogumAyi;
        this.dogumYili = dogumYili;
        this.kategori = kategori;
    }

    // Dosyadan personel bilgilerini okuyan metot
    private static List<Kisi> dosyadanPersonelOku() {
        List<Kisi> personelListesi = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(DOSYA_YOLU))) {
            String satir;
            br.readLine(); // Başlık satırını atla
            while ((satir = br.readLine()) != null) {
                String[] veriler = satir.split(";");
                String adSoyad = veriler[0].trim();
                int dogumGunu = Integer.parseInt(veriler[1].trim());
                int dogumAyi = Integer.parseInt(veriler[2].trim());
                int dogumYili = Integer.parseInt(veriler[3].trim());
                String kategori = veriler[4].trim();

                Kisi kisi = new Kisi(adSoyad, dogumGunu, dogumAyi, dogumYili, kategori);
                personelListesi.add(kisi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personelListesi;
    }

    // Personelleri estetik bir şekilde listeleyen metot
    public static void listele() {
        List<Kisi> personelListesi = dosyadanPersonelOku();

        System.out.printf("%-20s %-15s %-15s%n", "Ad Soyad", "Doğum Tarihi", "Kategori");
        System.out.println("---------------------------------------------------------");

        for (Kisi personel : personelListesi) {
            String dogumTarihi = String.format("%02d-%02d-%04d", personel.dogumGunu, personel.dogumAyi, personel.dogumYili);
            System.out.printf("%-20s %-15s %-15s%n", personel.adSoyad, dogumTarihi, personel.kategori);
        }
    }
}